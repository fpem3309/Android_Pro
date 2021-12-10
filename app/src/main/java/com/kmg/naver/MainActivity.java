package com.kmg.naver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.LocationTrackingMode;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.overlay.Marker;
import com.naver.maps.map.overlay.OverlayImage;
import com.naver.maps.map.util.FusedLocationSource;


public class MainActivity extends AppCompatActivity {

    Button btn_goboard;
    Button btn_goYoutube;
    Button btn_goReact;

    BottomNavigationView nv;

    Fragment_1 fg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_goboard = findViewById(R.id.btn_goboard);
        btn_goYoutube = findViewById(R.id.btn_goYoutube);
        btn_goReact = findViewById(R.id.btn_goReact);
        fg1 = new Fragment_1();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, fg1).commit();

        // 최초 실행될 fragment 고르기
        // fragment가 들어갈 공간(frameLayout)의 id
        // 같이 끼울 Fragment 객체

        nv = findViewById(R.id.bottomNavigationView);

    }

}
