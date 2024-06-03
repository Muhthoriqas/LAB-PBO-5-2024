package TP03;

public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;
// TODO1: create a constructor to your needs in Main.java    
    public HotWheels (){
    }
    
    public HotWheels(String name, double speed, double cash){
        this.name = name;
        this.speed = speed;
        this.cash = cash;
 
    }
// TODO2: call all the getter methods and print the output according to the format
    public void showSpec(){
        System.out.println("========== Specification ==========");
        System.out.println("Name            : " + getName() );
        System.out.println("Speed           : " + getSpeed());
        System.out.println("Winning Amount  : " + getWinningAmount());
        System.out.println("Cash            : Rp. " + getCash()+ "\n");    
    }

    public void upgrade(int budget) {
        if (budget > this.getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
            // Every Rp. 50,000 increase speed 1
            int increaseSpeed = budget / 50000;  
            // todo3: increase the speed of the car    
            this.speed += increaseSpeed;
            this.setCash(this.getCash() - budget );//ada mmgmi
            System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }
    public void raceTo(HotWheels enemy) {
        // todo 4: validate if the speed of this car is greater than the enemy's speed
        if (this.getSpeed() > enemy.speed) {
            // todo5 : increase the winning amount
            this.setWinningAmount(1);
            // todo 6: increase the cash of this car by 40000
            this.setCash(this.cash + 40000);
            // todo7: call all the getter methods and print the output according to the format
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), this.getName(), this.getWinningAmount());
        } else if (this.getSpeed() == enemy.getSpeed()) { // If the speed is equal 
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(),
                    enemy.getName());
        } else { // If the speed of this car is less than the enemy's speed
            // todo8: increase the winning amount ofthe enemy
            enemy.setWinningAmount(1);
            // todo9: increase the cash of the enemy by 40000
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(),
                    enemy.getName(), enemy.getWinningAmount());
        }
    }
    // todo10: create gettersetter methods for all the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }
}