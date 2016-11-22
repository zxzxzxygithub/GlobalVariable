package netblock.acnet.co.globalvariable;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by michael on 16/11/22.
 */

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String name = ((MyApplication) getApplication()).getmName();
        Log.d("getname", "onStartCommand: name——" + name);
        return super.onStartCommand(intent, flags, startId);
    }
}
