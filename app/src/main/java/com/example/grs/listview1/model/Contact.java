package com.example.grs.listview1.model;

/**
 * Created by Gr's on 03/03/18.
 */

public class Contact {
    private String mName;
    private String mItem;

    public Contact(String mName, String mItem) {
        this.mName = mName;
        this.mItem = mItem;
    }

    public String getmName() {
        return mName;
    }

    public String getmItem() {
        return mItem;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmItem(String mItem) {
        this.mItem = mItem;
    }
}
