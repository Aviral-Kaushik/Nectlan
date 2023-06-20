package com.aviral.netclan.Models;

public class RecyclerModel {

    private String name;

    private String location;

    private String intro;

    private String caption;

    public RecyclerModel(String name, String location, String intro, String caption) {
        this.name = name;
        this.location = location;
        this.intro = intro;
        this.caption = caption;
    }

    public String getUserName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
