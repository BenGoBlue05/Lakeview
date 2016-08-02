package com.example.android.lakeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LakeviewEastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(getString(R.string.lakeview_east_belmont_harbor),
                getString(R.string.lakeview_east_belmont_harbor_desc),
                R.drawable.lakeview_east_belmont_harbor));
        attractions.add(new Attraction(getString(R.string.lakeview_east_frances),
                getString(R.string.lakeview_east_frances_desc),
                R.drawable.lakeview_east_frances));
        attractions.add(new Attraction(getString(R.string.lakeview_east_lakeshore_path),
                getString(R.string.lakeview_east_lakeshore_path_desc),
                R.drawable.lakeview_east_lakeshore_path));
        attractions.add(new Attraction(getString(R.string.lakeview_east_tin_lizzie),
                getString(R.string.lakeview_east_tin_lizzie_desc),
                R.drawable.lakeview_east_tin_lizzie));
        attractions.add(new Attraction(getString(R.string.lakeview_east_weiner_circle),
                getString(R.string.lakeview_east_weiner_circle_desc),
                R.drawable.lakeview_east_weiner_circle));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        if (listView != null){
            listView.setAdapter(adapter);
        }
    }
}
