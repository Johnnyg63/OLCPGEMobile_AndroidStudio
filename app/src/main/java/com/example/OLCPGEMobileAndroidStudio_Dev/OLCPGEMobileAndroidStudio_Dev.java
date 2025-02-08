package com.example.OLCPGEMobileAndroidStudio_Dev;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/* Uncomment below if R.string.??? from the string.xml is giving you grief
/* import com.example.OLCPGEMobileAndroidStudio_Dev.R; */

public class OLCPGEMobileAndroidStudio_Dev extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Create a TextView and set its text to "PGE Mobile Release 2.2.x" */
        TextView tv = new TextView(this);
        tv.setText(R.string.jamtarts);
        setContentView(tv);
    }
}
