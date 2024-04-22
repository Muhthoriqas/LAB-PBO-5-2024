public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;

    public HotWheels (String name, double speed, double cash){
        this.speed = speed;
        this.cash = cash;
        this.name = name;
    }

    public HotWheels (){
        
    }

    public void showSpec() {
        // TODO 2: Call all the getter methods and print the output according to the format
        System.out.println("========== Specification ==========");
        System.out.println("Name            : " + getName());
        System.out.println("Speed           : " + getSpeed());
        System.out.println("Winning Amount  : " + getWinningAmount());
        System.out.println("Cash            : Rp. " + getCash() + "\n");
    }

    public void upgrade(int budget) {
        if (budget > this.getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
            // Every Rp. 50,000 increase speed 1
            int increaseSpeed = budget / 50000;

            // TODO 3: Increase the speed of the car
            this.speed += increaseSpeed;

            this.setCash(this.getCash() - budget + (budget % 50000));

            System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }

    public void raceTo(HotWheels enemy) {
        // TODO 4: Validate if the speed of this car is greater than the enemy's speed
        if (getSpeed() > enemy.getSpeed()) {
            // TODO 5: Increase the winning amount
            this.setWinningAmount(++this.winningAmount);

            // TODO 6: Increase the cash of this car by 40000
            this.cash += 40000;

            // TODO 7: Call all the getter methods and print the output according to the format
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", getName(), enemy.getName(), getWinningAmount());
        } else if (this.getSpeed() == enemy.getSpeed()) { // If the speed is equal
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(),
                    enemy.getName());
        } else { // If the speed of this car is less than the enemy's speed
            // TODO 8: Increase the winning amount of the enemy
            enemy.setWinningAmount(++enemy.winningAmount);

            // TODO 9: Increase the cash of the enemy by 40000
            enemy.setCash(enemy.cash += 40000);

            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(),
                    enemy.getName(), enemy.getWinningAmount());
        }
    }

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
