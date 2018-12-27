package com.np.dipendra.labpro;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DrawableUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText editTextEmail, editTextPassword;
Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail=findViewById(R.id.edit_text_email);
        editTextPassword=findViewById(R.id.edit_text_password);
        buttonLogin=findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String email=editTextEmail.getText().toString();
                 String password=editTextPassword.getText().toString();
                if(email.equalsIgnoreCase("dipendrabist.413@gmail.com")&& password.equalsIgnoreCase("dipendra")){
                    Toast.makeText(LoginActivity.this, "Successfully logged in!!!", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(LoginActivity.this, "Invalid email or password!!!", Toast.LENGTH_SHORT).show();
                }
                editTextEmail.getText().clear();
                editTextPassword.getText().clear();
            }

        });
    }
}
