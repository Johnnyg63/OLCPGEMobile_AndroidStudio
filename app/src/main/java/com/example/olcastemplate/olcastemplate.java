package com.example.olcastemplate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class olcastemplate extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Create a TextView and set its text to "PGE Mobile Release 2.2.1" */
        TextView tv = new TextView(this);
        tv.setText("PGE Mobile Release 2.2.1");
        setContentView(tv);
    }
}