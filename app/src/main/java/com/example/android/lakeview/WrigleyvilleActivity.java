package com.example.android.lakeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class WrigleyvilleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.wrigleyville_wrigley_field),
                getString(R.string.wrigleyville_wrigley_field_desc),
                R.drawable.wriggleyville_wrigley_field));
        attractions.add(new Attraction(getString(R.string.wrigleyville_sluggers),
                getString(R.string.wrigleyville_sluggers_desc),
                R.drawable.wriggleyville_sluggers));
        attractions.add(new Attraction(getString(R.string.wrigleyville_old_crow),
                getString(R.string.wrigleyville_old_crow_desc),
                R.drawable.wriggleyville_old_crow));
        attractions.add(new Attraction(getString(R.string.wrigleyville_pick_me_up),
                getString(R.string.wrigleyville_pick_me_up_desc),
                R.drawable.wriggleyville_pick_me_up));
        attractions.add(new Attraction(getString(R.string.wrigleyville_goose_island),
                getString(R.string.wrigleyville_goose_island_desc),
                R.drawable.wriggleyville_goose_island));
        attractions.add(new Attraction(getString(R.string.wrigleyville_deuces),
                getString(R.string.wrigleyville_deuces_desc),
                R.drawable.wriggleyville_deuces));
        attractions.add(new Attraction(getString(R.string.wrigleyville_rooftop),
                getString(R.string.wrigleyville_rooftop_desc),
                R.drawable.wrigleyville_rooftop_seats));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        if (listView != null){
            listView.setAdapter(adapter);
        }
    }
}
