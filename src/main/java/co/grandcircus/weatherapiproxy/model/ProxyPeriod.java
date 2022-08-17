package co.grandcircus.weatherapiproxy.model;

public class ProxyPeriod extends ForecastPeriods {

    private int temperatureCelsius;

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = (int) ((this.getTemperature() - 32) / 1.8);
    }
}
