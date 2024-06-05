package Praktikum8.Nomor2;

class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typerRacer;
    
    public Typer(String botName, double wpm, TypeRacer typerRacer){
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typerRacer = typerRacer;
    }
    
    public void setBotName(String botName) {
        this.botName = botName;
    }
    
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    
    public void addWordType(String newWordsTyped){
        this.wordsTyped  += newWordsTyped + " ";
    }
    
    public String getWordsTyped() {
        return wordsTyped;
    }
    
    public String getBotName() {
        return botName;
    }
    
    public double getWpm() {
        return wpm;
    }
    
    @Override
    public void run(){
        int howLongToType = 0;
        int kecepatan = (int) (60000 / wpm);
        String [] wordsToTyper = typerRacer.getWordsToType().split(" ");

        for (String word : wordsToTyper){
            try {
                Thread.sleep(kecepatan);
                addWordType(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            howLongToType++;
        }

        this.addWordType("(Selesai)");

        Result result = new Result(botName, howLongToType * kecepatan);
        typerRacer.addResult(result);
    }
    
}

