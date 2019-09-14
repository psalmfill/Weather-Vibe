package com.example.weathervibe.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rain {
    @SerializedName("3h")
    @Expose
    Double h;

    public Double getH() {
        return h;
    }
}
