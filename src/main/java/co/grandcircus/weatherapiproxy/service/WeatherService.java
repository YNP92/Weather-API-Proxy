package co.grandcircus.weatherapiproxy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import co.grandcircus.weatherapiproxy.model.ForecastResponse;
import co.grandcircus.weatherapiproxy.model.PointsResponse;

@Service
public class WeatherService {

    private RestTemplate request = new RestTemplate();

    public PointsResponse pointResponse(double lat, double lon) {
        String url = "https://api.weather.gov/points/{lat},{lon}";

        PointsResponse response = request.getForObject(url, PointsResponse.class, lat, lon);
        return response;
    }

    public ForecastResponse gridPointsResponse(PointsResponse pointsResponse) {

        ForecastResponse response = request
                .getForObject(pointsResponse.getProperties().getForecast(), ForecastResponse.class);
        return response;
    }

}
