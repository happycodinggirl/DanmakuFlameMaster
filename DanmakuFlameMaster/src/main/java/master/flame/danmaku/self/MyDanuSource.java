package master.flame.danmaku.self;

import master.flame.danmaku.danmaku.parser.IDataSource;

/**
 * Created by lily on 15-9-9.
 */
public class MyDanuSource<T> implements IDataSource<T> {
    T danu;
    //T danuList;

    public MyDanuSource(T danuList) {
        this.danu = danuList;
    }
    @Override
    public T data() {
        // TODO Auto-generated method stub
        return danu;
    }

   

    @Override
    public void release() {
        if (danu!=null) {

            danu=null;
        }
      

    }
}