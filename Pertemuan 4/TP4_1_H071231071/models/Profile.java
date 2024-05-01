package TP4_1_H071231071.models;

public class Profile {
    private String nama, hobi, nickname;
    private int umur;

    public Profile(String nama, int umur, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}