package co.grandcircus.weatherapiproxy.model.proxy;

import co.grandcircus.weatherapiproxy.model.forecast.ForecastPeriods;

public class ProxyPeriod extends ForecastPeriods {

    private int temperatureCelsius;

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperature) {

        this.temperatureCelsius = (int) ((this.getTemperature() - 32) / 1.8);
    }


    @Override
    public String toString() {
        return "ProxyPeriod [temperatureCelsius=" + temperatureCelsius + "]";
    }



}
