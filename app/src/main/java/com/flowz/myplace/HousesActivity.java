package com.flowz.myplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.flowz.myplace.Adapter.DisplayAdapter;
import com.flowz.myplace.Model.ModelOfDisplay;

import java.util.ArrayList;
import java.util.List;

public class HousesActivity extends AppCompatActivity {

    private DisplayAdapter adapter;
    private List<ModelOfDisplay> myHouses;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houses);

        myHouses = new ArrayList<>();

        myHouses.add(new ModelOfDisplay( R.drawable.housefine, "$ 10000", "Two bedrooms flat for rent" ));
        myHouses.add(new ModelOfDisplay( R.drawable.houseforrentalso, "$ 67000", "Ten bedrooms flat for rent" ));
        myHouses.add(new ModelOfDisplay( R.drawable.housetwo, "$ 25000", "three bedrooms flat for rent" ));
        myHouses.add(new ModelOfDisplay( R.drawable.finehouse, "$ 45000", "4 bedrooms flat for rent" ));

        adapter = new DisplayAdapter(myHouses);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView listOfHouses = findViewById(R.id.myRecyclerView);

        listOfHouses.setLayoutManager(layoutManager);

        listOfHouses.setAdapter(adapter);


    }
}
