// package Tugas_LAB_PBO.TP_8.Task_2;

import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Pungpung", 200, typeRacer);
        typers[1] = new Typer("Bot paypay", 72, typeRacer);
        typers[2] = new Typer("Bot puyo", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
