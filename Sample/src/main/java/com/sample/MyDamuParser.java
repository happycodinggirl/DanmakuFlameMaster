package com.sample;

import android.graphics.Color;

import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.parser.DanmakuFactory;


/**
 * Created by lily on 15-9-9.
 */
public class MyDamuParser extends BaseDanmakuParser {




    IDanmakuView iDanmakuView;

    public MyDamuParser(IDanmakuView iDanmakuView) {
        this.iDanmakuView = iDanmakuView;
    }

    @Override
    protected IDanmakus parse() {

    /*    if (mDataSource!=null){
            MyDanuSource pluDanuSource= (MyDanuSource) mDataSource;
            return  doParse(pluDanuSource.data());
        }*/
        return new Danmakus();
    }





   



   /* protected float　getViewportSizeFactor(){
        return 8*1000f;
    }*/

    public float getViewportSizeFactor(){
        return 8*1000;
    }


}