package com.example.testapp5;

public class ItemModel {
    private int thumb;
    private String caption;
    private boolean checked;

    public ItemModel(int thumb, String caption) {
        this.thumb = thumb;
        this.caption = caption;
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

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
