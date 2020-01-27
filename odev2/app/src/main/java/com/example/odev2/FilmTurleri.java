package com.example.odev2;

import android.os.Parcel;
import android.os.Parcelable;

public class FilmTurleri implements Parcelable {


    private int imgId;
    private String name;

    public FilmTurleri() {


    }

    public FilmTurleri(int imgId, String name) {
        this.imgId = imgId;
        this.name = name;
    }

    protected FilmTurleri(Parcel in) {
        imgId = in.readInt();
        name = in.readString();
    }

    public static final Creator<FilmTurleri> CREATOR = new Creator<FilmTurleri>() {
        @Override
        public FilmTurleri createFromParcel(Parcel in) {
            return new FilmTurleri(in);
        }

        @Override
        public FilmTurleri[] newArray(int size) {
            return new FilmTurleri[size];
        }
    };

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imgId);
        dest.writeString(name);
    }
}
