public class Player {
    String name;
    double power;
    int money;
    double time = 0;


    Weapon weapon = new Weapon();

    public Player() {
    }
    
    public Player(String name){
        this.name = name;
    }

    public Player(String name, double power){
        this.name = name;
        this.power = power;
    }

    public Player(String name, double power, int money){
        this.name = name;
        this.power = power;
        this.money = money;
    }

    public Player(String name, double power, int money, Weapon weapon){
        this.name = name;
        this.power = power;
        this.money = money;
        this.weapon = weapon;
    }

    public Player(String name, double power, int money, String type){
        this.name = name;
        this.power = power;
        this.money = money;
        this.weapon.type = type;
    }

    public Player(String name, double power, int money, String type, int damage){
        this.name = name;
        this.power = power;
        this.money = money;
        this.weapon.type = type;
        this.weapon.damage = damage;
    }

    public Player(String name, double power, int money, String type, int damage, int ammo){
        this.name = name;
        this.power = power;
        this.money = money;
        this.weapon.type = type;
        this.weapon.damage = damage;
        this.weapon.ammo = ammo;
    }

    public Player(String name, double power, int money, String type, int damage, int ammo, double loadTime, double time){
        this.name = name;
        this.power = power;
        this.money = money;
        this.weapon.type = type;
        this.weapon.damage = damage;
        this.weapon.ammo = ammo;
        this.weapon.loadTime = loadTime;
        this.time = time;

    }

    public void data() {
        System.out.println("===== Player Data =====");
        System.out.println("Name           : " + this.getName());
        System.out.println("Power          : " + this.getPower());
        System.out.println("Money          : " + this.getMoney());
        System.out.println("WeaponType     : " + this.getWeapon().getType());
        System.out.println("WeaponDamage   : " + this.getWeapon().getDamage());
        System.out.println("WeaponAmmo     : " + this.getWeapon().getAmmo());
        System.out.println("WeaponLoadTime : " + this.getWeapon().getLoadTime());
        System.out.println("=======================\n");
    }

    public void upgradeWeapon(int price ) {
        if (money >= price) {
            this.setMoney(this.getMoney()-price);
            this.getWeapon().setDamage(this.getWeapon().getDamage() + 3);
            this.getWeapon().setAmmo(this.getWeapon().getAmmo() + 5);
            this.getWeapon().setLoadTime(this.getWeapon().getLoadTime() - 1);
            System.out.printf("%s telah mengupgrade %s dengan damage menjadi %d dengan %d ammo\n",this.getName(), this.getWeapon().getType(), this.getWeapon().getDamage(),this.getWeapon().getAmmo());
        }
        else {
            System.out.println("Uang tidak cukup.\n");
        }
    }

    public void Killing(Zombie zombie) {
        System.out.printf("%s mulai melawan zombie dengan senjatanya\n",this.getName());
        while(true){
            if(zombie.getHealth()> 0){
                zombie.setHealth(zombie.getHealth()- (this.getWeapon().getDamage()));
                this.getWeapon().setAmmo(this.getWeapon().getAmmo()- 1);
                this.setTime(this.getTime() + 1);
                System.out.println("Menembak ! sisa : " + zombie.getHealth());
            }if (this.getWeapon().getAmmo() < 1){
                this.getWeapon().setAmmo(this.getWeapon().getAmmo() + this.getWeapon().getDefAmmo());
                this.setTime(this.getTime() + this.getWeapon().getLoadTime());
                System.out.println("Reloading !");
            }else if (zombie.getHealth() < 1){
                System.out.printf("%s berhasil membunuh zombie dengan waktu ",this.getName());
                System.out.println(this.getTime() + " detik");
                this.setTime(0);
                break;
            }
        }
    }

    public String getName(){
        return name;
    }
    public double getPower(){
        return power;
    }
    public int getMoney(){
        return money;
    }
    public double getTime(){
        return time;
    }
    public Weapon getWeapon(){
        return weapon;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPower(double power){
        this.power = power;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

}