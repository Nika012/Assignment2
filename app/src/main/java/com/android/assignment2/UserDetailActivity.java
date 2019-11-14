package com.android.assignment2;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDetailActivity extends AppCompatActivity {
        TextView textviewName,textviewGender,textviewdob,textviewcountry,textviewphone,textviewemail;
        ImageView ImageView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user_detail);

            ImageView= findViewById(R.id.ivUserImg);


            textviewName= findViewById(R.id.tvUsrName);
            textviewGender= findViewById(R.id.tvUsrGender);
            textviewdob= findViewById(R.id.tvUsrDoB);
            textviewcountry= findViewById(R.id.tvUsrCountry);
            textviewphone= findViewById(R.id.tvUsrPhone);
            textviewemail= findViewById(R.id.tvUsrEmail);


            Intent intent = getIntent();
            String name= intent.getStringExtra("Name");
            String gender= intent.getStringExtra("Gender");
            String dob = intent.getStringExtra("Dob");
            String country= intent.getStringExtra("Country");
            String phone= intent.getStringExtra("Phone");
            String email= intent.getStringExtra("Email");
            String image= intent.getStringExtra("img");


            String uri = "@drawable/" + image;
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());

            ImageView.setImageResource(imageResource);


            textviewName.setText("Name :"+name);
            textviewGender.setText("Gender :"+gender);
            textviewdob.setText("DOB :"+dob);
            textviewcountry.setText("Country :"+country);
            textviewphone.setText("Phone :"+phone);
            textviewemail.setText("Email :"+email);
        }
    }
