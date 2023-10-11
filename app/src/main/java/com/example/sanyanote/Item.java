package com.example.sanyanote;

import java.util.ArrayList;

public class Item {
    private String text;
    private String date;

    private int pos;
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    Item(String text, String date, int pos){
        this.text = text;
        this.date = date;
        this.pos = pos;
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
