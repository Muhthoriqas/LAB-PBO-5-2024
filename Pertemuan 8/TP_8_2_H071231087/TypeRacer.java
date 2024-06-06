package TP_8_2_H071231087;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya", 
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang", 
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik", 
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita", 
        "Perubahan adalah satu satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas", 
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna", 
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
    }; 

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10); 
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4) 
    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }

    public synchronized void addWordToRaceProgress(String botName, String word) {
        for (Typer typer : raceContestant) {
            if (typer.getBotName().equals(botName)) {
                typer.addWordsTyped(word);
                break;
            }
        }
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================");

        // TODO (5) 
        for (int i = 0; i < raceStanding.size(); i++) {
            Result result = raceStanding.get(i);
            System.out.println((i + 1) + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
        }
    }

    public void startRace() throws InterruptedException {
        //TODO (6)
        for (Typer typer : raceContestant) {
            typer.start();
        }

        //TODO(7)
        boolean raceInProgress;
        do {
            raceInProgress = false;
            System.out.println("\nTyping Progress...");
            System.out.println("=====================");
            for (Typer typer : raceContestant) {
                System.out.println("- " + typer.getBotName() + " => " + typer.getWordsTyped());
                if (!typer.getWordsTyped().endsWith(" (Selesai) ")) {
                    raceInProgress = true;
                }
            }
            Thread.sleep(2000);
        } while (raceInProgress);

        //TODO(8)
        printRaceStanding();
    }
}
