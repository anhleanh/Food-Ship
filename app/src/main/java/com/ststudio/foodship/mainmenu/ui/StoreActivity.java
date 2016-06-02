package com.ststudio.foodship.mainmenu.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ststudio.foodship.R;

import java.util.List;

public class StoreActivity extends AppCompatActivity {

    private ListView mNearbyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        mNearbyList = (ListView) findViewById(R.id.store_nearby_list);

        mNearbyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
