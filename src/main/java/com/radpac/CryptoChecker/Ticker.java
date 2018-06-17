package com.radpac.CryptoChecker;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "max",
    "min",
    "last",
    "bid",
    "ask",
    "vwap",
    "average",
    "volume"
})
public class Ticker {

    @JsonProperty("max")
    private Double max;
    @JsonProperty("min")
    private Double min;
    @JsonProperty("last")
    private Double last;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("vwap")
    private Double vwap;
    @JsonProperty("average")
    private Double average;
    @JsonProperty("volume")
    private Double volume;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("max")
    public Double getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Double max) {
        this.max = max;
    }

    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    @JsonProperty("last")
    public Double getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(Double last) {
        this.last = last;
    }

    @JsonProperty("bid")
    public Double getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public Double getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonProperty("vwap")
    public Double getVwap() {
        return vwap;
    }

    @JsonProperty("vwap")
    public void setVwap(Double vwap) {
        this.vwap = vwap;
    }

    @JsonProperty("average")
    public Double getAverage() {
        return average;
    }

    @JsonProperty("average")
    public void setAverage(Double average) {
        this.average = average;
    }

    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Maximum: "+this.max+"\n Mininum: "+this.min+"\n Last: "+this.last+"\n Bid: "+this.bid+"\n Ask: "+this.ask+"\n Volume: "+this.volume;
    }

}
