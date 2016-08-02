package com.example.android.lakeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BoystownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(getString(R.string.boystown_ann_sather),
                getString(R.string.boystown_ann_sather_desc),
                R.drawable.boystown_ann_sather));
        attractions.add(new Attraction(getString(R.string.boystown_pride_parade),
                getString(R.string.boystown_pride_parade_desc),
                R.drawable.boystown_gay_pride));
        attractions.add(new Attraction(getString(R.string.boystown_hb),
                getString(R.string.boystown_hb_desc),
                R.drawable.boystown_hb));
        attractions.add(new Attraction(getString(R.string.boystown_playground),
                getString(R.string.boystown_playground_desc),
                R.drawable.boystown_playground_theater));
        attractions.add(new Attraction(getString(R.string.boystown_roscoes),
                getString(R.string.boystown_roscoes_desc),
                R.drawable.boystown_roscoes));
        attractions.add(new Attraction(getString(R.string.boystown_sidetrack),
                getString(R.string.boystown_sidetrack_desc),
                R.drawable.boystown_sidetrack));

        ListView listView = (ListView) findViewById(R.id.list);
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);
        if (listView != null){
            listView.setAdapter(attractionAdapter);
        }
    }
}
