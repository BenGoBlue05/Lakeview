package com.example.android.lakeview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bplewis5 on 6/30/16.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View itemView = convertView;
        if (itemView == null){
            itemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView attractionName = (TextView) itemView.findViewById(R.id.attraction_text_view);
        TextView description = (TextView) itemView.findViewById(R.id.description_text_view);
        ImageView attractionImage = (ImageView) itemView.findViewById(R.id.attraction_image_view);

        attractionName.setText(currentAttraction.getName());
        description.setText(currentAttraction.getDescription());
        attractionImage.setImageResource(currentAttraction.getImageId());

        return itemView;
    }
}
