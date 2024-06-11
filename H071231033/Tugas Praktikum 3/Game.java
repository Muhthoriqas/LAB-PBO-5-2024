class Senjata{
    int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

//player
class Player extends Senjata{
    String name;
    double health;
    int level;
    Senjata senjata;

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public Player(){}

    public Player(String name, double health, int level, Senjata senjata){
        this.name = name;
        this.health = health;
        this.level = level;
        this.senjata = senjata;
    }

    
    void attack(Player Musuh){
        Musuh.health -= senjata.getDamage();
        System.out.println(this.name + " menyerang " + Musuh.name + " dengan damage " + senjata.getDamage());
    }

    void display(){
        System.out.println("\nName : " + this.getName());
        System.out.println("Health : " + this.getHealth() + " hp");   
        System.out.println("Level : " + this.getLevel());
        System.out.println("Damage : " + this.getDamage());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

   

    
}


public class Game {
    public static void main(String[] args) {
        
        Senjata senjata1 = new Senjata();
        senjata1.damage = 100;

        Senjata senjata2 = new Senjata();
        senjata2.damage = 300;
        //membuat object player
        Player player1 = new Player("Patrick", 100.10, 10,  senjata1);
        Player player2 = new Player();
        player2.setName("Squidword");
        player2.setHealth(100);
        player2.setLevel(12);
        player2.setSenjata(senjata2);

        player1.display();
        player2.display();

        System.out.println("\nBATTLE");
        System.out.println("\nRound 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
    }
    
}