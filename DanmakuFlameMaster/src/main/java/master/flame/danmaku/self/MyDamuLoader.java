package master.flame.danmaku.self;

import java.io.InputStream;

import master.flame.danmaku.danmaku.loader.ILoader;
import master.flame.danmaku.danmaku.loader.IllegalDataException;

import master.flame.danmaku.danmaku.parser.IDataSource;

/**
 * Created by lily on 15-9-9.
 */
public class MyDamuLoader implements ILoader {


    private static MyDamuLoader instance;

    MyDanuSource mDanuSource;





    @Override
    public IDataSource<?> getDataSource() {
        return mDanuSource;
    }

    @Override
    public void load(String uri) throws IllegalDataException {

    }

    @Override
    public void load(InputStream in) throws IllegalDataException {

    }

    @Override
    public void load(Object data) {
        this.mDanuSource= (MyDanuSource) data;

    }


    public static ILoader instance() {
        if(instance == null){
            synchronized (MyDamuLoader.class){
                if(instance == null)
                    instance = new MyDamuLoader();
            }
        }
        return instance;
    }
}
