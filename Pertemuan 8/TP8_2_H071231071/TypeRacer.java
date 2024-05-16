import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

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

    private String[] wordToTypeList = {
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
            "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
    };

    void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordToTypeList[angkaRandom];
    }

    // TODO 4
    synchronized void addToRaceStanding(Result result) {
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO 5
        // raceStanding.sort((r1, r2) -> Integer.compare(r1.getFinishTime(),
        // r2.getFinishTime()));

        // Mencetak klasemen akhir
        int posisi = 1;
        for (Result result : raceStanding) {
            System.out.println(posisi + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
            posisi++;
        }
    }

    void startRace() {
        // TODO 6
        for (Typer typer : raceContestant) {
            typer.start();
        }

        // TODO 7
        boolean raceFinished = false;
        while (!raceFinished) {
            raceFinished = true;
            // System.out.println("|| Text to type ||");

            for (Typer typer : raceContestant) {
                System.out.println("\n===============\n");
                System.out.printf("- %s\t => %s\n", typer.getBotName(), typer.getWordsTyped());
                if (typer.isAlive()) {
                    raceFinished = false;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // TODO 8
        printRaceStanding();
    }
}
