package com.kmg.naver;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class newboard extends AppCompatActivity {
    EditText newb_subject,newb_content,newb_name;
    ImageButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newboard);

        newb_subject = findViewById(R.id.newb_subject);
        newb_content = findViewById(R.id.newb_content);
        newb_name = findViewById(R.id.newb_name);
        btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = newb_name.getText().toString();
                String subject = newb_subject.getText().toString();
                String content = newb_content.getText().toString();

                Intent intent = new Intent(getApplicationContext(),boardActivity.class);
                intent.putExtra("subject",subject);
                intent.putExtra("content",content);
                intent.putExtra("name",name);
                setResult(RESULT_OK, intent);
                finish();

            }

        });

    }


}


