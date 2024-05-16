public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        // TODO 1
        long howLongToType = (long) ((60000 / wpm)); // waktu dalam milisecond untuk mengetik satu kata

        // TODO 2
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addWordsTyped(word);
        }

        this.addWordsTyped("(selesai)");

        // TODO 3
        int finishTime = (int) howLongToType * wordsToType.length / 1000;
        Result result = new Result(botName, finishTime);
        typeRacer.addToRaceStanding(result); // waktu
                                             // selesai
                                             // dalam
                                             // detik

    }
}
