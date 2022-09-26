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
        TextView textViewCreateTime = convertView.findViewById(R.id.createTime_text);
        TextView textViewTitle = convertView.findViewById(R.id.title_text);
        TextView textDescription = convertView.findViewById(R.id.description_text);
        TextView textAuthor = convertView.findViewById(R.id.author_text);

        textViewCreateTime.setText(news.getCreate_time());
        textViewTitle.setText(news.getTitle());
        textDescription.setText(news.getDescription());

        return convertView;
    }

}
