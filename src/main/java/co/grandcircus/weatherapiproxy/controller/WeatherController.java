package co.grandcircus.weatherapiproxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.grandcircus.weatherapiproxy.model.ForecastProperties;
import co.grandcircus.weatherapiproxy.model.ProxyPeriod;
import co.grandcircus.weatherapiproxy.model.ProxyResponse;
import co.grandcircus.weatherapiproxy.service.WeatherService;

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/forecast")
    public ForecastProperties getPeriodList(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.gridPointsResponse(weatherService.pointResponse(lat, lon))
                .getProperties();
    }

    @GetMapping("/forecast/plus")
    public ProxyResponse getProxyResponse(@RequestParam double lat, @RequestParam double lon) {

        ProxyResponse proxyResponse =
                weatherService.proxyResponse(weatherService.pointResponse(lat, lon));
        // get rid of the stats
        int toalTemp = 0;
        int avgTemp = 0;
        for (ProxyPeriod proxyPeriod : proxyResponse.getPeriods()) {
            toalTemp += proxyPeriod.getTemperature();
            avgTemp = toalTemp / proxyResponse.getPeriods().size();

            if (proxyResponse.getStats().getHottestPeriod() == null) {
                proxyResponse.getStats().setHottestPeriod(proxyPeriod);
            }
            if (proxyResponse.getStats().getColdestPeriod() == null) {
                proxyResponse.getStats().setColdestPeriod(proxyPeriod);
                continue;
            }
            if (proxyPeriod.getTemperature() > proxyResponse.getStats().getHottestPeriod()
                    .getTemperature()) {
                proxyResponse.getStats().setHottestPeriod(proxyPeriod);
            }
            if (proxyPeriod.getTemperature() > proxyResponse.getStats().getColdestPeriod()
                    .getTemperature()) {
                proxyResponse.getStats().setColdestPeriod(proxyPeriod);
            }

        }
        proxyResponse.getStats().setAverageTemperature(avgTemp);


        return proxyResponse;
    }



}
