package co.grandcircus.weatherapiproxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.grandcircus.weatherapiproxy.model.ForecastProperties;
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



}
