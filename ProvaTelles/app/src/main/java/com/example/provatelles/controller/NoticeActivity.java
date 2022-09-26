package com.example.provatelles.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.provatelles.R;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView title = findViewById(R.id.title_text);
        TextView description = findViewById(R.id.description_text);
        TextView author = findViewById(R.id.author_text);

        Bundle bundle = getIntent().getExtras();
        bundle.getBundle("key");
        bundle.getBundle("description");
        bundle.getBundle("author");

        title.setText(bundle.getString("title"));
        description.setText(bundle.getString("description"));
        author.setText(bundle.getString("author"));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}