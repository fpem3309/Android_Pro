package com.kmg.naver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Fragment_1 fragment_1;

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

        fragment_1 = new Fragment_1();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment_1).commit();

        nv = findViewById(R.id.bottomNavigationView);

        nv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.tab1:
                        Toast.makeText(getApplicationContext(),"1번 선택!",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment_1).commit();
                        Toast.makeText(getApplicationContext(),"2번 선택!",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.tab3:
                        Toast.makeText(getApplicationContext(),"3번 선택!",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.tab4:
                        Toast.makeText(getApplicationContext(),"4번 선택!",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.tab5:
                        Toast.makeText(getApplicationContext(),"5번 선택!",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

}
