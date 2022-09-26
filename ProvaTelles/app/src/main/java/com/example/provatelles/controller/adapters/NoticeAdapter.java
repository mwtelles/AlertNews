package com.example.provatelles.controller.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.provatelles.R;
import com.example.provatelles.model.entity.Post;

import java.util.List;

public class NoticeAdapter extends BaseAdapter {
    private List<Post> noticeList;

    public NoticeAdapter(List<Post> noticeList) {
        this.noticeList = noticeList;
    }

    @Override
    public int getCount() {
        return this.noticeList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.noticeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.noticeList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        }

        Post news = (Post) getItem(position);
        TextView textViewTitle = convertView.findViewById(R.id.title_text);
        TextView textDescription = convertView.findViewById(R.id.description_text);
        TextView textViewPostContent = convertView.findViewById(R.id.postContent_text);
        TextView textViewAuthor = convertView.findViewById(R.id.author_text);
        TextView textViewCreateTime = convertView.findViewById(R.id.createTime_text);
        TextView textViewUpdateTime = convertView.findViewById(R.id.updateTime_text);
        TextView textViewCreateDate = convertView.findViewById(R.id.createDate_text);
        TextView textViewUpdateDate = convertView.findViewById(R.id.updateDate_text);
        TextView textViewReadingTime = convertView.findViewById(R.id.readTime_text);


        textViewTitle.setText(news.getTitle());
        textDescription.setText(news.getDescription());
        textViewPostContent.setText(news.getContent());
        textViewAuthor.setText(news.getAuthor());
        textViewCreateTime.setText(news.getCreate_time());
        textViewUpdateTime.setText(news.getUpdate_time());
        textViewCreateDate.setText(news.getCreate_date());
        textViewUpdateDate.setText(news.getUpdate_date());
        textViewReadingTime.setText(news.getReading_time());

        return convertView;
    }

}
