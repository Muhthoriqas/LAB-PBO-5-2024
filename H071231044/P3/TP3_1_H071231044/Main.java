public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon();
        weapon1.setType("pistol");
        weapon1.setAmmo(12);
        weapon1.setDamage(10);
        weapon1.setLoadTime(3.5);
        weapon1.setDefAmmo(12);

        Player player1 = new Player();
        player1.setName("Leon");
        player1.setPower(3);
        player1.setMoney(10000);
        player1.setWeapon(weapon1);

        Weapon weapon2 = new Weapon("Deagle",25,6,7,6);

        Player player2 = new Player("Claire",5,4000);
        player2.setWeapon(weapon2);

        Zombie zombie1a = new Zombie();
        zombie1a.setHealth(100);

        Zombie zombie1b = new Zombie(200);
        
        Zombie zombie2a = new Zombie();
        zombie2a.setHealth(100);


        Zombie zombie2b = new Zombie(200);

        player1.data();

        player1.Killing(zombie1a);
        barrier();
        player1.upgradeWeapon(8000);
        player1.data();
        player1.Killing(zombie1b);
        barrier();

        player2.data();
        player2.Killing(zombie2a);
        barrier();
        player2.upgradeWeapon(8000);
        player2.data();
        player2.Killing(zombie2b);
        barrier();

    }

    public static void barrier() {
        System.out.println("==================================================");
    }
}
