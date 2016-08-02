package com.example.android.lakeview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout wrigleyville = (LinearLayout) findViewById(R.id.wriggleyville);
        LinearLayout boystown = (LinearLayout) findViewById(R.id.boystown);
        LinearLayout lakeviewEast = (LinearLayout) findViewById(R.id.lakeview_east);
        TextView more = (TextView) findViewById(R.id.more);

        wrigleyville.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        WrigleyvilleActivity.class));
            }
        });

        boystown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        BoystownActivity.class));
            }
        });

        lakeviewEast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        LakeviewEastActivity.class));
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MoreActivity.class));
            }
        });


    }


}
