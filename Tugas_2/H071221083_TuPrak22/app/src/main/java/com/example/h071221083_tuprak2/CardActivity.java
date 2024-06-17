package com.example.h071221083_tuprak2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {
    private String editNameValue, editUsernameValue;
    private Uri image;
    private String title, content;
    private TextView nameView, usernameView, titleView, contentView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        nameView = findViewById(R.id.nameView);
        usernameView = findViewById(R.id.usernameView);
        imageView = findViewById(R.id.imageUser);
        titleView = findViewById(R.id.title);
        contentView = findViewById(R.id.content);

        Intent getMain = getIntent();
        editNameValue = getMain.getStringExtra("name");
        editUsernameValue = getMain.getStringExtra("username");
        image = getMain.getParcelableExtra("image");
        title = getMain.getStringExtra("title");
        content = getMain.getStringExtra("content");

        nameView.setText(editNameValue);
        usernameView.setText(editUsernameValue);
        imageView.setImageURI(image);
        titleView.setText(title);
        contentView.setText(content);
    }
}