package com.ststudio.foodship.login.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ststudio.foodship.R;

public class SignupActivity extends AppCompatActivity {

    private Button btnSignup;
    private EditText edtUsername, edtEmail,edtPhone, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignup = (Button) findViewById(R.id.signup_btn);
        edtUsername = (EditText) findViewById(R.id.signup_username_edt);
        edtEmail = (EditText) findViewById(R.id.signup_email_edt);
        edtPhone = (EditText) findViewById(R.id.signup_phone_edt);
        edtPassword = (EditText) findViewById(R.id.signup_password_edt);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String email = edtEmail.getText().toString();
                String phone = edtPhone.getText().toString();
                String password = edtPassword.getText().toString();

                username = username.trim();
                email = email.trim();
                phone = phone.trim();
                password = password.trim();



            }
        });
    }
}
