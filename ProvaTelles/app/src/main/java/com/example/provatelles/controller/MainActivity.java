package com.example.provatelles.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.provatelles.R;
import com.example.provatelles.controller.adapters.NoticeAdapter;
import com.example.provatelles.model.dao.NoticeDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        NoticeDao newsDao = new NoticeDao();

        ListView listView = findViewById(R.id.listViewCards);
        listView.setAdapter(new NoticeAdapter(newsDao.getAllNotices()));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String title = (String) ((TextView) view.findViewById(R.id.title_text)).getText();
                String description = (String) ((TextView) view.findViewById(R.id.description_text)).getText();
                String author = (String) ((TextView) view.findViewById(R.id.author_text)).getText();
                String content = (String) ((TextView) view.findViewById(R.id.postContent_text)).getText();
                String createTime = (String) ((TextView) view.findViewById(R.id.createTime_text)).getText();
                String updateTime = (String) ((TextView) view.findViewById(R.id.updateTime_text)).getText();
                String createDate = (String) ((TextView) view.findViewById(R.id.createDate_text)).getText();
                String updateDate = (String) ((TextView) view.findViewById(R.id.updateDate_text)).getText();
                String readingTime = (String) ((TextView) view.findViewById(R.id.readTime_text)).getText();


                Intent intent = new Intent(MainActivity.this, NoticeActivity.class);

                Bundle object = new Bundle();
                object.putString("title", title);
                object.putString("description", description);
                object.putString("content", content);
                object.putString("author", author);
                object.putString("createTime", createTime);
                object.putString("updateTime", updateTime);
                object.putString("createDate", createDate);
                object.putString("updateDate", updateDate);
                object.putString("readingTime", readingTime);
                intent.putExtras(object);
                startActivity(intent);

            }
        });
    }
}