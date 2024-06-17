package com.example.h071221083_tuprak2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NoteActiivity extends AppCompatActivity {
    private EditText title, content;
    private ImageView imageView;
    private Uri image;
    String editNameValue;
    String editUsernameValue;
    private Button save_note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        save_note = findViewById(R.id.save_note);

//        String editTitleValue = title.getText().toString();
//        String editContentValue = content.getText().toString();

        Intent getMain = getIntent();
        editNameValue = getMain.getStringExtra("name");
        editUsernameValue = getMain.getStringExtra("username");
        image = getMain.getParcelableExtra("image");

        save_note.setOnClickListener(view -> {
            String editTitleValue = title.getText().toString();
            String editContentValue = content.getText().toString();
            if (editTitleValue.isEmpty() || editContentValue.isEmpty()) {
                Toast.makeText(NoteActiivity.this, "Title and Content must be filled", Toast.LENGTH_SHORT).show();
            } else {
            Intent intent = new Intent(NoteActiivity.this, CardActivity.class);
            intent.putExtra("title", editTitleValue);
            intent.putExtra("content", editContentValue);
            intent.putExtra("name", editNameValue);
            intent.putExtra("username", editUsernameValue);
            intent.putExtra("image", image);
            startActivity(intent);}
        });

    };
}
