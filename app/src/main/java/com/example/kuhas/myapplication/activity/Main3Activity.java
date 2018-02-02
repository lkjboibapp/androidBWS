package com.example.kuhas.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kuhas.myapplication.Page3.APIService;
import com.example.kuhas.myapplication.Page3.AdapterListView;
import com.example.kuhas.myapplication.Page3.DataList;
import com.example.kuhas.myapplication.R;
import com.example.kuhas.myapplication.manager.Dao;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



         ListView listView = findViewById(R.id.list);
        final AdapterListView adapterListView = new AdapterListView(getApplicationContext());
        listView.setAdapter(adapterListView);

        APIService apiService = new APIService();

        Call<DataList> call = apiService.getService().getReport();
        call.enqueue(new Callback<DataList>() {
            @Override
            public void onResponse(Call<DataList> call, Response<DataList> response) {
                if (response.isSuccessful()) {
                    DataList dataList = response.body();
                    Dao.getInstance().setDataList(dataList);
                    adapterListView.notifyDataSetChanged();
                        Log.d("123", String.valueOf(dataList.getData().size()));

                }else {

                    Toast.makeText(Main3Activity.this, response.errorBody().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<DataList> call, Throwable t) {

                Toast.makeText(Main3Activity.this, "เน็ตหลุด", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
