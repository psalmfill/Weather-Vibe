package com.example.weathervibe.Models;

import android.view.accessibility.AccessibilityNodeInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("coord")
    @Expose
    Coord coord;
    @SerializedName("weather")
    @Expose
    Weather weather;
    @SerializedName("base")
    @Expose
    String base;
    @SerializedName("main")
    @Expose
    Main main;
    @SerializedName("wind")
    @Expose
    Wind wind;
    @SerializedName("rain")
    @Expose
    Rain rain;
    @SerializedName("clouds")
    @Expose
    Clouds clouds;
    @SerializedName("dt")
    @Expose
    Integer dt;
    @SerializedName("sys")
    @Expose
    Sys sys;
    @SerializedName("timezone")
    @Expose
    Integer timezone;
    @SerializedName("id")
    @Expose
    Integer id;
    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("code")
    @Expose
    Integer code;

    public Coord getCoord() {
        return coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Rain getRain() {
        return rain;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }
}

