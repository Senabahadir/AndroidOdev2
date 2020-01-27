package com.example.odev2;

import android.os.Parcel;
import android.os.Parcelable;

public class FilmDetay implements Parcelable {

    private int filmId;
    private String yonetmen;
    private String oyuncular;
    private String oduller;

    public FilmDetay() {
    }

    public FilmDetay(int filmId, String yonetmen, String oyuncular, String oduller) {
        this.filmId = filmId;
        this.yonetmen = yonetmen;
        this.oyuncular = oyuncular;
        this.oduller = oduller;
    }

    protected FilmDetay(Parcel in) {
        filmId = in.readInt();
        yonetmen = in.readString();
        oyuncular = in.readString();
        oduller = in.readString();
    }

    public static final Creator<FilmDetay> CREATOR = new Creator<FilmDetay>() {
        @Override
        public FilmDetay createFromParcel(Parcel in) {
            return new FilmDetay(in);
        }

        @Override
        public FilmDetay[] newArray(int size) {
            return new FilmDetay[size];
        }
    };

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public String getOyuncular() {
        return oyuncular;
    }

    public void setOyuncular(String oyuncular) {
        this.oyuncular = oyuncular;
    }

    public String getOduller() {
        return oduller;
    }

    public void setOduller(String oduller) {
        this.oduller = oduller;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(filmId);
        dest.writeString(yonetmen);
        dest.writeString(oyuncular);
        dest.writeString(oduller);
    }
}
