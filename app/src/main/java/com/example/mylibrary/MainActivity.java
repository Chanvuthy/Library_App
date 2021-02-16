package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeAllBooks,btnCurrentReadingBooks,btnAlreadyReadBooks,btnYourWishList,btnSeeYourFavorites,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnSeeAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllBookActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initViews(){
        btnSeeAllBooks=findViewById(R.id.btnSeeAllBooks);
        btnCurrentReadingBooks=findViewById(R.id.btnCurrentReadingBooks);
        btnAlreadyReadBooks=findViewById(R.id.btnAlreadyReadBooks);
        btnYourWishList=findViewById(R.id.btnYourWishList);
        btnSeeYourFavorites=findViewById(R.id.btnSeeYourFavorites);
        btnAbout=findViewById(R.id.btnAbout);
    }
}