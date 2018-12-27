package com.np.dipendra.labpro;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DrawableUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn_register, btn_login;
private Animation animation;
private TextView textView;
Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv_welcome_msg);
        btn_register=findViewById(R.id.btn_register);
        btn_login=findViewById(R.id.btnLogin);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_move_left);
        textView.startAnimation(animation);
        btn_register.startAnimation(animation);
        btn_login.startAnimation(animation);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
