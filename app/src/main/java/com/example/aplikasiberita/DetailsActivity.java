package com.example.aplikasiberita;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasiberita.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView text_detail_title, txt_author, txt_time, txt_detail, txt_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AplikasiBerita);
        setContentView(R.layout.activity_details);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        text_detail_title = findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_content);
        img_news = findViewById(R.id.img_detail_news);

        text_detail_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_time.setText(headlines.getPublishedAt());
        txt_detail.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_news);
    }
}