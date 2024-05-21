public class Weapon {
    String type;
    int damage;
    int ammo;
    int defAmmo;
    double loadTime;

    public Weapon(){
    }

    public Weapon(String type, int damage, int ammo, double loadTime, int defAmmo){
        this.type = type;
        this.damage = damage;
        this.ammo = ammo;
        this.loadTime = loadTime;
        this.defAmmo = defAmmo;
    }

    public String getType(){
        return type;
    }

    public int getDamage(){
        return damage;
    }

    public int getAmmo(){
        return ammo;
    }
    public int getDefAmmo(){
        return defAmmo;
    }

    public double getLoadTime(){
        return loadTime;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setAmmo(int ammo){
        this.ammo = ammo;
    }

    public void setDefAmmo(int defAmmo){
        this.defAmmo = defAmmo;
    }

    public void setLoadTime(double loadTime){
        this.loadTime = loadTime;
    }


}