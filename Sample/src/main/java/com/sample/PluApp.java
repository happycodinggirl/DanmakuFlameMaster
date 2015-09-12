package com.sample;

import android.app.Application;
import android.util.DisplayMetrics;

/**
 * Created by lily on 15-9-9.
 */
public class PluApp extends Application {
    static int singleHeight=0;
    @Override
    public void onCreate() {
        super.onCreate();
        DisplayMetrics displayMetrics=getResources().getDisplayMetrics();
        singleHeight=displayMetrics.widthPixels/13;

        float sd=displayMetrics.scaledDensity;
        singleHeight=px2sp(singleHeight,sd);


       // PluLogUtil.log("----single height is "+singleHeight);
    }

    public static int px2sp(float pxValue, float fontScale) {
        return (int) (pxValue / fontScale + 0.5f);
    }


}
