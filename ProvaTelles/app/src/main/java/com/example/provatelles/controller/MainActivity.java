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

        ListView listView = findViewById(R.id.listViewNewsCard);
        listView.setAdapter(new NoticeAdapter(newsDao.getAllNotices()));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String title = (String) ((TextView) view.findViewById(R.id.title_text)).getText();
                String description = (String) ((TextView) view.findViewById(R.id.description_text)).getText();

                Intent intent = new Intent(MainActivity.this, NoticeActivity.class);

                Bundle object = new Bundle();
                object.putString("title", title);
                object.putString("description", description);
                intent.putExtras(object);
                startActivity(intent);

            }
        });
    }
}