package org.techtown.mission_recyclerview;

import android.util.Log;

public class BusinesscardActivity {

    String name;
    String birth;
    String number;
    String picture; //사진

    public BusinesscardActivity(String name, String birth, String number, String picture) {
        this.name = name;
        this.birth = birth;
        this.number = number;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPicture() {
        return picture;

    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
