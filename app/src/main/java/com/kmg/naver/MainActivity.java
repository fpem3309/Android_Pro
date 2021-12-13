package com.kmg.naver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private Fragment_1 fragment_1;
    private FragmentTransaction transaction;

    Button btn_goboard;
    Button btn_goYoutube;
    Button btn_goReact;

    BottomNavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_goboard = findViewById(R.id.btn_goboard);
        btn_goYoutube = findViewById(R.id.btn_goYoutube);
        btn_goReact = findViewById(R.id.btn_goReact);


        fragmentManager = getSupportFragmentManager();
        fragment_1 = new Fragment_1();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayouit, fragment_1).commitAllowingStateLoss();

        nv = findViewById(R.id.bottomNavigationView);

        nv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,fragment_1).commit();
                        Toast.makeText(getApplicationContext(),"Web 선택!",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

}
