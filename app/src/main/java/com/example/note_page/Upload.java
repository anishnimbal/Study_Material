package com.example.note_page;

import android.app.Activity;

public class Upload extends Activity {

    public String name;
    public String url;

    public Upload(){

    }

    public Upload(String name,String url){
        this.name=name;
        this.url=url;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url){
        this.url=url;
    }
}
