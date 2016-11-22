package netblock.acnet.co.globalvariable;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SecActivity extends Activity {

    private TextView tvSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);

        tvSec = (TextView) findViewById(R.id.tv_sec);
        String name = ((MyApplication) getApplication()).getmName();
        tvSec.setText("this is the changed global variable_"+name+"\n"+" check log to see service get the global data");
    }

}
