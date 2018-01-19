package com.example.stefanomora.demodashboard;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private DashboardView mDashboardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView(R.layout.activity_main);

        mDashboardView = new DashboardView(getApplicationContext());
        setContentView(mDashboardView);
    }
}
