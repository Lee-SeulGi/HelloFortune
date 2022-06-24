package com.example.hellofortune;

public class ListItem {
    private String title;
    private String info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    ListItem(String title, String info){
        this.title = title;
        this.info = info;
    }

}
