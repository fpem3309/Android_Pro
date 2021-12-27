package com.kmg.naver;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Fragment_3 extends Fragment {

    private ImageButton btn_write;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        btn_write = view.findViewById(R.id.btn_write);

        btn_write.setOnClickListener(new View.OnClickListener() {   // 글작성 버튼 눌렀을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newboard.class);
                startActivity(intent);
                //adapter.notifyDataSetChanged();
            }
        });

        return view;
    }
}