package netblock.acnet.co.globalvariable;

import android.app.Application;

/**
 * Created by michael on 16/11/22.
 */

public class MyApplication extends Application {

    private String mName="default";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
