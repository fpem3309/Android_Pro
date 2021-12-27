package com.kmg.naver;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


// onCreateView 빼고 나머지 지우기

 public class Fragment_2 extends Fragment {
     WebView wv;


     @Nullable
     @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        wv = view.findViewById(R.id.webview);
        String url = "https://fpem3309.github.io/nwitter";

         //1-1 webView 환경설정해주기
         WebSettings settings = wv.getSettings();
         settings.setJavaScriptEnabled(true);    // javascript 사용가능

         //1-2 webClient 지정
         wv.setWebViewClient(new WebViewClient());

         //1-3 띄워줄 url 지정
         wv.loadUrl(url);

         //1-4 인터넷 권한 부여  ->  manifest.xml
        return view;
    }
}