package com.gkr.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Iterator;
import java.util.Set;

public class NextActivity extends AppCompatActivity {

    private static final String LOG_TAG = "NxtScreen";

    private StringBuilder strBuildr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();



        TextView txt = (TextView) findViewById(R.id.txt_show);

        strBuildr = new StringBuilder();
        if (bundle != null) {
            Set<String> keys = bundle.keySet();
            Iterator<String> it = keys.iterator();
            Log.e(LOG_TAG,"Dumping Intent start");
            while (it.hasNext()) {
                String key = it.next();
                String val = "[" + key + "=" + bundle.get(key)+"]";
                strBuildr.append(val);
                strBuildr.append("\n");
                Log.e(LOG_TAG,"[" + key + "=" + bundle.get(key)+"]");
            }
            Log.e(LOG_TAG,"Dumping Intent end");
        }

        txt.setText(strBuildr.toString());
    }
}
