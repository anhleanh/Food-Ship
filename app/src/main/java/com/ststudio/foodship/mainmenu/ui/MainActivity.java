package com.ststudio.foodship.mainmenu.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.ststudio.foodship.R;

public class MainActivity extends AppCompatActivity {

    GridView cateoryGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cateoryGrid = (GridView) findViewById(R.id.main_category_grid);

    }
}
