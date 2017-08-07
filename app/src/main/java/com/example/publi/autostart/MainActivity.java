package com.example.publi.autostart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BootCompleteReceiver bootCompleteReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bootCompleteReceiver=new BootCompleteReceiver();
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        unregisterReceiver(bootCompleteReceiver);
//    }
}
