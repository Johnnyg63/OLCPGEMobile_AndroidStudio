package com.example.OLCPGEMobileAndroidStudio_Dev;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OLCPGEMobileAndroidStudio_Dev extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Create a TextView and set its text to "PGE Mobile Release 2.2.X" */
        TextView tv = new TextView(this);
        tv.setText("PGE Mobile Release 2.2.X");
        setContentView(tv);
    }
}
