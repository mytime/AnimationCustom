package com.jikexueyuan.animationcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 自定义动画： 摇头
 */
public class MainActivity extends AppCompatActivity {

    private AnimCustom ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac = new AnimCustom();
        ac.setDuration(1000);

        findViewById(R.id.btnAnimMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(ac);
            }
        });
    }
}
