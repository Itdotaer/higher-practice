package com.itdotaer.access.pojo;

/**
 * Created by jt_hu on 2016/12/30.
 */
public class Article {

    private int id;
    private _User user;
    private String title;
    private String content;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public _User getUser() {
        return user;
    }
    public void setUser(_User user) {
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
