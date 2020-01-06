package com.github.tenx.tecnoesis20admin.data.models;

import com.google.firebase.database.PropertyName;

public class FeedResponseBody {
    @PropertyName("image")
    String image;

    @PropertyName("text")
    String text;

    @PropertyName("date")
    String date;

    public FeedResponseBody() {
    }

    public FeedResponseBody(String image, String text) {
        this.image = image;
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
