package co.grandcircus.weatherapiproxy.model;

public class ForecastPeriods {

    private int number;
    private String name;
    private String startTime;
    private String endTime;
    private Boolean isDaytime;
    private int temperature;
    private String temperatureUnit;
    // the type is not specified
    private String temperatureTrend;
    private String windSpeed;
    private String windDirection;
    private String icon;
    private String shortForecast;
    private String detailedForecast;
    private int temperatureCelsius;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsDaytime() {
        return isDaytime;
    }

    public void setIsDaytime(Boolean isDaytime) {
        this.isDaytime = isDaytime;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public String getTemperatureTrend() {
        return temperatureTrend;
    }

    public void setTemperatureTrend(String temperatureTrend) {
        this.temperatureTrend = temperatureTrend;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getShortForecast() {
        return shortForecast;
    }

    public void setShortForecast(String shortForecast) {
        this.shortForecast = shortForecast;
    }

    public String getDetailedForecast() {
        return detailedForecast;
    }

    public void setDetailedForecast(String detailedForecast) {
        this.detailedForecast = detailedForecast;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }


    public ForecastPeriods() {}


    public ForecastPeriods(int number, String name, String startTime, String endTime,
            Boolean isDaytime, int temperature, String temperatureUnit, String temperatureTrend,
            String windSpeed, String windDirection, String icon, String shortForecast,
            String detailedForecast, int temperatureCelsius) {
        this.number = number;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isDaytime = isDaytime;
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
        this.temperatureTrend = temperatureTrend;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.icon = icon;
        this.shortForecast = shortForecast;
        this.detailedForecast = detailedForecast;
        this.temperatureCelsius = temperatureCelsius;
    }


    @Override
    public String toString() {
        return "forecast [detailedForecast=" + detailedForecast + ", endTime=" + endTime + ", icon="
                + icon + ", isDaytime=" + isDaytime + ", name=" + name + ", number=" + number
                + ", shortForecast=" + shortForecast + ", startTime=" + startTime + ", temperature="
                + temperature + ", temperatureCelsius=" + temperatureCelsius + ", temperatureTrend="
                + temperatureTrend + ", temperatureUnit=" + temperatureUnit + ", windDirection="
                + windDirection + ", windSpeed=" + windSpeed + "]";
    }



}
