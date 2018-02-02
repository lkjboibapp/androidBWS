package com.example.kuhas.myapplication.manager;

import android.content.Context;

import com.example.kuhas.myapplication.Page3.DataList;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class Dao {

    private static Dao instance;

    public static Dao getInstance() {
        if (instance == null)
            instance = new Dao();
        return instance;
    }

    private Context mContext;
    private DataList dataList;
    private Dao() {
        mContext = Contextor.getInstance().getContext();
    }

    public DataList getDataList() {
        return dataList;
    }

    public void setDataList(DataList dataList) {
        this.dataList = dataList;
    }
}
