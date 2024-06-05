package Praktikum8.Nomor2;

public class Result {
    private String name;
    private int finishtime;

    public Result(String name, int finishtime){
        this.name = name;
        this.finishtime = finishtime;
    }

    public String getName() {
        return name;
    }

    public void setBotName(String racerName){
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishtime;
    }

    public void setFinishTime(int racerTime) {
        this.finishtime = racerTime;
    }
}