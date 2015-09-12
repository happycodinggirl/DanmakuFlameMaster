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



    /**
     * @param danmakuListData 弹幕数据
     *                        传入的数组内包含普通弹幕，会员弹幕，锁定弹幕。
     * @return 转换后的Danmakus
     */
    private Danmakus doParse(MsgDanu danmakuListData) {
        Danmakus danmakus = new Danmakus();
        /*if (danmakuListData == null || danmakuListData.size() == 0) {
            return danmakus;
        }*/
       // for (int i = 0; i < danmakuListData.size(); i++) {

                //JSONObject danmakuArray = danmakuListData.getJSONObject(i);
                //if (danmakuArray != null) {
                    danmakus = _parse(danmakuListData, danmakus);
              // }
       // }
        return danmakus;
    }


    private Danmakus _parse(MsgDanu msgDanu, Danmakus danmakus) {
        if (danmakus == null) {
            danmakus = new Danmakus();
        }
      /*  if (msgList == null || msgList.size()== 0) {
            return danmakus;
        }*/
      //  for (int i = 0; i < msgList.size(); i++) {
            try {
              //  MsgDanu msgDanu=msgList.get(i);
                //JSONObject obj = jsonObject;
               // String c = obj.getString("c");
               // String[] values = c.split(",");
               // if (values.length > 0) {
                  //  int type = Integer.parseInt(values[2]); // 弹幕类型
                  //  if (type == 7)
                        // FIXME : hard code
                        // TODO : parse advance danmaku json
                       // continue;
                    long time = msgDanu.getTime();

                    // 出现时间
                    //PluLogUtil.log("--------time is " + time);

                    int color = Color.WHITE; // 颜色
                   // float textSize = Float.parseFloat(values[3]); // 字体大小
                    BaseDanmaku item = DanmakuFactory.createDanmaku(1, mDisp);
                    if (item != null) {
                       // item.time = iDanmakuView.getCurrentTime()+msgDanu.getTime();

                        item.paintHeight=PluApp.singleHeight;
                        //item.lines=13;

                        int width=iDanmakuView.getWidth();



                        item.textSize=PluApp.singleHeight;
                        float right=item.getRight();

                        //item.padding=10;



                       // item.textSize = PluApp.singleHeight;
                        item.textColor = color;
                        item.textShadowColor = color <= Color.BLACK ? Color.WHITE : Color.BLACK;
                        DanmakuFactory.fillText(item, msgDanu.getMsg());
                       // item.index = i;
                       /* if (i==10){
                            item.index=15;
                        }*/
                        item.time=iDanmakuView.getCurrentTime()+3000;
                        item.setTimer(mTimer);
                        danmakus.addItem(item);

                    }
               // }
            }catch (NumberFormatException e) {
            }
        //}
        return danmakus;
    }



   /* protected float　getViewportSizeFactor(){
        return 8*1000f;
    }*/

    public float getViewportSizeFactor(){
        return 8*1000;
    }


}