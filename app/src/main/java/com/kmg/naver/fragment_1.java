package com.kmg.naver;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// onCreateView 빼고 나머지 지우기

 class Fragment_1 extends Fragment {
    // Fragmet 1
    // 1. WebView 쓰는 법
    // 2. 저장된 url 정보 가져오는 법 -> SPF
    WebView wv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // fragment.xml 파일을 view로 inflate(id -> view)하여 반환

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        wv = view.findViewById(R.id.webview);

        //spf에서 값 꺼내기, 한줄로 간단하게

        //String url = "https://www.smhrd.or.kr";
        String url = getActivity().getSharedPreferences("mySPF", Context.MODE_PRIVATE)
                .getString("address",null);

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