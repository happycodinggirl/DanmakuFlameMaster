package com.sample;

import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDisplayer;

/**
 * Created by lily on 15-9-9.
 */
public class MsgDanu extends BaseDanmaku {

    String msg;

    public String getMsg() {
        return msg;
    }

    long time ;

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    @Override
    public void layout(IDisplayer displayer, float x, float y) {

    }

    @Override
    public float[] getRectAtTime(IDisplayer displayer, long currTime) {
        return new float[0];
    }

    @Override
    public float getLeft() {
        return 0;
    }

    @Override
    public float getTop() {
        return 0;
    }

    @Override
    public float getRight() {
        return 0;
    }

    @Override
    public float getBottom() {
        return 0;
    }

    @Override
    public int getType() {
        return 0;
    }
}
