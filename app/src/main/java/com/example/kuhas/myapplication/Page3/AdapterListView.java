package com.example.kuhas.myapplication.Page3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.kuhas.myapplication.manager.Dao;
import com.example.kuhas.myapplication.view.ListItem;

/**
 * Created by kuhas on 2/2/2561.
 */

public class AdapterListView extends BaseAdapter {


    Context mContext;




    public AdapterListView(Context mContext) {
        this.mContext = mContext;


    }


    @Override
    public int getCount() {
        if (Dao.getInstance().getDataList()== null)
            return 0;
        if (Dao.getInstance().getDataList().getData()== null)
            return 0;
        return Dao.getInstance().getDataList().getData().size();

    }

    @Override
    public Object getItem(int i) {
        return Dao.getInstance().getDataList().getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ListItem listItem;

        if (view != null)
            listItem = (ListItem) view;
        else
            listItem = new ListItem(viewGroup.getContext());

        GetAndSet dao = (GetAndSet) getItem(i);

        listItem.setTvname(dao.getVdotitle());

        return listItem;


//        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//
//        view = mInflater.inflate(R.layout.name_list, viewGroup, false);
//        TextView textView =view.findViewById(R.id.tx);
//        textView.setText("kkkkkk");
//
//
//        return view;
    }
}
