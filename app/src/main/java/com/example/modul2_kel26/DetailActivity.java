package com.example.modul2_kel26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel26.R;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private TextView tvFnama,tvLnama,tvEmail;
    private ImageView ivFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvFnama = findViewById(R.id.tv_item_first_name);
        tvLnama = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);
        ivFoto = findViewById(R.id.img_photo_user);

        if (getIntent().hasExtra("fname")) {
            String fnama = getIntent().getStringExtra("fname");
            tvFnama.setText("Hello! "+fnama);
            String lnama = getIntent().getStringExtra("lname");
            tvLnama.setText(lnama);
            String email = getIntent().getStringExtra("email");
            tvEmail.setText(email);
            Glide.with(getApplicationContext()).load(getIntent().getStringExtra("img")).into(ivFoto);
        }
    }
}
