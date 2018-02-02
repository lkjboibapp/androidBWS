package com.example.kuhas.myapplication.Page3;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuhas on 2/2/2561.
 */

public class DataList {
    @SerializedName("data") private List<GetAndSet> data ;

    public List<GetAndSet> getData() {
        return data;
    }

    public void setData(List<GetAndSet> data) {
        this.data = data;
    }
}
