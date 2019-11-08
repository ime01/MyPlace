package com.flowz.myplace.Model;

import android.widget.ImageView;

public class ModelOfDisplay {

    public int mydisplayedPic;
    public String myPrice;
    public String myUnit;


    public ModelOfDisplay (int displayPic, String Price, String Unit){
        mydisplayedPic = displayPic;
        myPrice = Price;
        myUnit = Unit;
    }

    public int getMydisplayedPic() {
        return mydisplayedPic;
    }

    public String getMyPrice() {
        return myPrice;
    }

    public String getMyUnit() {
        return myUnit;
    }










}



