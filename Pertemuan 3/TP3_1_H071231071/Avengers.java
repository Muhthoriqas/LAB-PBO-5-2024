public class Avengers {
    int health = 100; // default health
    String skill;
    Hero hero = new Hero(); // perlu diinisialisasi

    Avengers(String name) {
        this.hero.name = name;
    }

    Avengers(String name, String skill) {
        this.skill = skill;
        this.hero.name = name;
    }

    Avengers(String name, String skill, int damage) {
        this.skill = skill;
        this.hero.name = name;
        this.hero.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    void info() {
        System.out.println("-------- Avenger Hero's Info --------");
        System.out.println("Name: " + this.getHero().getName());
        System.out.println("Skill: " + this.getSkill());
        System.out.println("Health: " + this.getHealth()); // tambahkan ":" setelah "Health"
        System.out.println("Damage: " + this.getHero().getDamage());
    }

    void battle(Avengers enemy) {
        System.out.println(this.getHero().getName() + " attacks " + enemy.getHero().getName());
        enemy.health -= this.hero.damage;
        this.health -= enemy.hero.damage;

        System.out.println(this.getHero().getName() + " health: " + this.health);
        System.out.println(enemy.getHero().getName() + " health: " +
                enemy.getHealth());
        if (enemy.getHealth() <= 0) {
            System.out.println(enemy.getHero().getName() + " has been defeated by " + this.getHero().getName());
        } else if (this.getHealth() <= 0) {
            System.out.println("\n" + this.getHero().getName() + " has been defeated by " + enemy.getHero().getName());
        }

    }

}

class Hero {
    String name;
    int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}

// class Main {
// public static void main(String[] args) {
// Avengers av1 = new Avengers("Thor", "God of Thunder", 50);
// Avengers av2 = new Avengers("Thanos", "Titan", 40);

// av1.info();
// System.out.println("================ VS ===================");
// av2.info();

// System.out.println();
// av1.battle(av2);
// System.out.println();
// av2.battle(av1);
// }
// }
