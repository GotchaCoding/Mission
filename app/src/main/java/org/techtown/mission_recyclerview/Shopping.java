package org.techtown.mission_recyclerview;

public class Shopping {

    String name;
    String price;
    String comment;
    int picture;

    public Shopping(String name, String price, String comment, int picture) {
        this.name = name;
        this.price = price;
        this.comment = comment;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
