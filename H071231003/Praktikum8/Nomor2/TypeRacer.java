package Praktikum8.Nomor2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    private String[] wordToTypeList = {
            "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgengdan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    public void setNewWordToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordToTypeList[angkaRandom];
    }

    public void addResult(Result result) {
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        for (int i = 0; i < raceStanding.size(); i++) {
            // int j = 1;
            System.out.println(String.format("{%d}.{%s} = {%d}milisecon", i + 1, raceStanding.get(i).getName(),
                    raceStanding.get(i).getFinishTime()));
        }
    }

    public void starRace() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor1 = Executors.newSingleThreadExecutor();

        for (Typer typer : raceContestant) {
            executor.execute(typer);
        }

        boolean isAllTyperFinished = false;
        while (!isAllTyperFinished) {
            try {
                Thread.sleep(2000); // Menunggu 2 detik
                for (Typer ty : raceContestant) {
                    System.out.println(String.format("-{%s}\t=> {%s}", ty.getBotName(), ty.getWordsTyped()));
                }
                if (raceContestant.size() == raceStanding.size()) {
                    isAllTyperFinished = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        executor1.shutdown();
        printRaceStanding();

    }
}
