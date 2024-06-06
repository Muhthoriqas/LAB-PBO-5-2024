package TP_8_2_H071231087;

public class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;
      
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
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
      
        //TODO (1)  
        int howLongToType = (int) ((60.0 / wpm) * 1000);
      
        //TODO (2) 
        long startTime = System.currentTimeMillis();
            for (String word : wordsToType) {
                try {
                    Thread.sleep(howLongToType);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            this.addWordsTyped(word);  
        }
      
            this.addWordsTyped("(Selesai)");
        long finishTime = (System.currentTimeMillis() - startTime) / 1000;
      
        //TODO (3) 
        Result result = new Result(botName, (int) finishTime);
        typeRacer.addResult(result);
    }
}