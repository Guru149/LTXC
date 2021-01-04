package com.example.ltxc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_fragment extends Fragment {

    EditText email,password,phonenumber;;
    Button login;
    TextView forgetpassword;
    float o=0;

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root= (ViewGroup)inflater.inflate(R.layout.fragment_login_fragment, container, false);

        email=root.findViewById(R.id.email);
        password=root.findViewById(R.id.password);
        phonenumber=root.findViewById(R.id.phone_number);
        login=root.findViewById(R.id.loginbtn);
        forgetpassword=root.findViewById(R.id.forgetpassword);

      /*  email.setTranslationY(800);
        password.setTranslationY(800);
        phonenumber.setTranslationY(800);
        login.setTranslationY(800);
        forgetpassword.setTranslationY(800);

        email.setAlpha(o);
        password.setAlpha(o);
        phonenumber.setAlpha(o);
        login.setAlpha(o);
        forgetpassword.setAlpha(o);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        phonenumber.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        forgetpassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

*/

        return  root;
    }
}