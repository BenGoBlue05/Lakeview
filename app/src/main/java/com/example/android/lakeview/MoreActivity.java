package com.example.android.lakeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(getString(R.string.more_big_and_littles),
                getString(R.string.more_big_and_littles_desc),
                R.drawable.more_big_and_littles));
        attractions.add(new Attraction(getString(R.string.more_cba),
                getString(R.string.more_cba_desc),
                R.drawable.more_cba));
        attractions.add(new Attraction(getString(R.string.more_dmk),
                getString(R.string.more_dmk_desc),
                R.drawable.more_dmk));
        attractions.add(new Attraction(getString(R.string.more_laugh_factory),
                getString(R.string.more_laugh_factory_desc),
                R.drawable.more_laugh_factory));
        attractions.add(new Attraction(getString(R.string.more_vic),
                getString(R.string.more_vic_desc),
                R.drawable.more_vic));

        ListView listView = (ListView) findViewById(R.id.list);
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);
        if (listView != null){
            listView.setAdapter(attractionAdapter);
        }
    }
}
