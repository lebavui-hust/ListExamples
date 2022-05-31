package com.example.testapp5;

public class ChatModel {
    private int thumb;
    private String caption;
    private boolean isMe;

    public ChatModel(int thumb, String caption, boolean isMe) {
        this.thumb = thumb;
        this.caption = caption;
        this.isMe = isMe;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public boolean isMe() {
        return isMe;
    }

    public void setMe(boolean me) {
        isMe = me;
    }
}
