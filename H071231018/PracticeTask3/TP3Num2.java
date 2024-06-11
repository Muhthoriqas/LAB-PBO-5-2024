public class TP3Num2 {
    public static void main(String[] args) {
    HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 4, 100000);
    HotWheels ferharri = new HotWheels();
    ferharri.setName("Ferharri");
    ferharri.setSpeed(4);
    ferharri.setCash(50000);
    System.out.println();
    mercebesDenz.showSpec();
    ferharri.showSpec();
    printBarriers();
    mercebesDenz.upgrade(100000);
    printBarriers();
    ferharri.upgrade(50000);
    printBarriers();
    System.out.println();
    ferharri.showSpec();
    printBarriers();
    ferharri.raceTo(mercebesDenz);
    printBarriers();
    mercebesDenz.raceTo(ferharri);
    printBarriers();
    System.out.println();
    mercebesDenz.showSpec();
    ferharri.showSpec();
    }
    public static void printBarriers() {
    System.out.println("================================");
    }
}

class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;
    
    public HotWheels(String name, double speed, double cash, int winningAmount){
        this.name = name;
        this.speed = speed;
        this.cash = cash;
        this.winningAmount = winningAmount;
    }

    public HotWheels(String name, double speed, double cash){
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }

    public HotWheels(){
    }

    public void showSpec() {
        System.out.println("========== Specification ==========");
        System.out.println("Name : " + getName());
        System.out.println("Speed : " + getSpeed());
        System.out.println("Winning Amount : " + getWinningAmount());
        System.out.println("Cash : Rp. " + getCash() + "\n");
    }

    public void upgrade(int budget) {
        if (budget > this.getCash()) {
        System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
        // Every Rp. 50,000 increase speed 1
        int increaseSpeed = budget / 50000;
        this.speed += increaseSpeed;
        this.setCash(this.getCash() - budget + (budget % 50000));
        System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }
    public void raceTo(HotWheels enemy) {
        if (this.getSpeed() > enemy.getSpeed()) {
            this.setWinningAmount(this.getWinningAmount() + 1);
            this.cash += 40000;
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), enemy.getName(), this.getWinningAmount());
            } else if (this.getSpeed() == enemy.getSpeed()) { // If the speed is equal
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
            } else { // If the speed of this car is less than the enemy's speed
            enemy.setWinningAmount(enemy.getWinningAmount() + 1);
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getCash(){
        return cash;
    }

    public void setCash(double cash){
        this.cash = cash;
    }

    public int getWinningAmount(){
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount){
        this.winningAmount = winningAmount;
    } 
}