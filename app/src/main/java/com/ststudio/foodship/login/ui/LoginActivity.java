package com.ststudio.foodship.login.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ststudio.foodship.R;

public class LoginActivity extends AppCompatActivity {

    Button btnSignin;
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignin = (Button) findViewById(R.id.signin_btn);
        edtUsername = (EditText) findViewById(R.id.signin_username_or_email_edt);
        edtPassword = (EditText) findViewById(R.id.signin_password_edt);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                username = username.trim();
                password = password.trim();
            }
        });
    }
}
