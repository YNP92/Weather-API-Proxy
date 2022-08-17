package co.grandcircus.weatherapiproxy.model;

import java.util.List;

public class ForecastProperties {

    private List<ForecastPeriods> periods;

    public List<ForecastPeriods> getPeriods() {
        return periods;
    }

    public void setPeriods(List<ForecastPeriods> periods) {
        this.periods = periods;
    }
}
