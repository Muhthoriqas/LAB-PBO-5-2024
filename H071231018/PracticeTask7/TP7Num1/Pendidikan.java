package TP7Num1;

import java.util.Arrays;

class Pendidikan {
    int skorPendidikan;
    String tingkatPendidikan;

    public void hitungPendidikan(String pdkn){
        String validLevels = "SD, SMP, SMA, D3, S1, S2, S3";
        this.tingkatPendidikan = pdkn;
        if (Arrays.asList(validLevels.split(", ")).contains(pdkn)) {
            switch (pdkn) {
            case "SD":
                this.skorPendidikan = 1;
                break;
            case "SMP":
                this.skorPendidikan = 2;
                break;
            case "SMA":
                this.skorPendidikan = 3;
                break;
            case "D3":
                this.skorPendidikan = 4;
                break;
            case "S1":
                this.skorPendidikan = 5;
                break;
            case "S2":
                this.skorPendidikan = 6;
                break;
            case "S3":
                this.skorPendidikan = 7;
                break;
        }
        }
    }
}