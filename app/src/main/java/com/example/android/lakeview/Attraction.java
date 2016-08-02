package com.example.android.lakeview;

/**
 * Created by bplewis5 on 6/30/16.
 */
public class Attraction {
    private String mName;
    private String mDescription;
    private int mImageId;

    public Attraction(String name, String description, int imageId){
        mName = name;
        mDescription = description;
        mImageId = imageId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
