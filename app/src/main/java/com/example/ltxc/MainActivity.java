package com.example.ltxc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationselected);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container , new ltxc_home()).commit();

        }
        private  BottomNavigationView.OnNavigationItemSelectedListener navigationselected=new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedfragment=new ltxc_home();
                switch (item.getItemId())
                {
                    case R.id.home:
                        selectedfragment= new ltxc_home();
                        break;
                    case R.id.books:
                        selectedfragment=new ltxc_course();
                        break;
                    case R.id.notification:
                        selectedfragment=new ltxc_notification();
                        break;
                    case R.id.profile:
                        selectedfragment=new ltxc_profile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,selectedfragment).commit();
                return true;
            }
        };
    }