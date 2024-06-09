import java.util.*;
class TypeRacer {
    private static String wordsToType;
    
    static ArrayList<Typer> raceContestant = new ArrayList<>();
    static ArrayList<Result> raceStanding = new ArrayList<>();
    
    public String getWordsToType() {
        return wordsToType;
    }
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private final static String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampaui nya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        TypeRacer.wordsToType = wordsToTypeList[angkaRandom];
    }

    //TODO 4
    void addResult(Typer typer) {
        int finish_time = (int) (60000/typer.getWpm())*typer.getWordsTyped().split(" ").length;
        Result res = new Result(typer.getBotName(), finish_time);
        raceStanding.add(res);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=".repeat(200)+"\n");

        //TODO 5
        for (int i = 0; i < raceStanding.size(); i++){
            double finishTime = (double) (raceStanding.get(i).getFinishTime());
            double outputDetik = finishTime/1000;
            System.out.println(String.format("%d. %s = %.2f detik", (i + 1), raceStanding.get(i).getName(), outputDetik));
        }
    }

    public void startRace() {
        // this.setNewWordsToType();
        
        for (Typer i: raceContestant){
            i.start();
        }

        //TODO 7
        while (true) {
            if (raceStanding.size() != raceContestant.size()) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("\nTyping Progress ...");
                System.out.println("=".repeat(200)+"\n");
                for (Typer j:raceContestant){
                    System.out.println(" " + j.getBotName() + " => " +j.getWordsTyped());
                }
            }
            else{
                break;
            }
        }
        // TODO 8
        this.printRaceStanding();
    }
}

