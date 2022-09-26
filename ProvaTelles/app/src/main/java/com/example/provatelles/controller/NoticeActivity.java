package com.example.provatelles.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.provatelles.R;

import java.util.Objects;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView title = findViewById(R.id.title_text);
        TextView description = findViewById(R.id.description_text);
        TextView content = findViewById(R.id.postContent_text);
        TextView author = findViewById(R.id.author_text);
        TextView createTime = findViewById(R.id.createTime_text);
        TextView updateTime = findViewById(R.id.updateTime_text);
        TextView createDate = findViewById(R.id.createDate_text);
        TextView updateDate = findViewById(R.id.updateDate_text);
        TextView readingTime = findViewById(R.id.readTime_text);

        Bundle bundle = getIntent().getExtras();
        bundle.getBundle("key");
        bundle.getBundle("description");
        bundle.getBundle("content");
        bundle.getBundle("author");
        bundle.getBundle("createTime");
        bundle.getBundle("updateTime");
        bundle.getBundle("createDate");
        bundle.getBundle("updateDate");
        bundle.getBundle("readingTime");

        title.setText(bundle.getString("title"));
        description.setText(bundle.getString("description"));
        content.setText(bundle.getString("content"));
        author.setText(bundle.getString("author"));
        createTime.setText(bundle.getString("createTime"));
        updateTime.setText(bundle.getString("updateTime"));
        createDate.setText(bundle.getString("createDate"));
        updateDate.setText(bundle.getString("updateDate"));
        readingTime.setText(bundle.getString("readingTime"));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}