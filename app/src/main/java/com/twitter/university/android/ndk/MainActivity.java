/*
 * Copyright (c) 2015 Twitter Inc.
 */
package com.twitter.university.android.ndk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
    private FastAdder svc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        svc = new FastAdder();
        setContentView(R.layout.activity_main);
        findViewById(R.id.compute).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { handleClick();  }
        });
    }

    private void handleClick() {
        int sum = svc.add(
                Integer.parseInt(((TextView) findViewById(R.id.addend1)).getText().toString()),
                Integer.parseInt(((TextView) findViewById(R.id.addend2)).getText().toString()));
        ((TextView) findViewById(R.id.sum)).setText(String.valueOf(sum));
    }
}
