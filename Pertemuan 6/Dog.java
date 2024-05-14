public abstract class Dog implements Bergerak{
    int position;
    int averageLength;

    abstract void describe();
}

class Pitbull extends Dog {
    Pitbull(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move() {
        this.position += 3;
    }

    void describe() {
        System.out.println("Deskripsi: berbulu pendek dengan ciri tengkorak lebar, rahang kuat, tubuh kekar dan berotot, juga penuh keberanian dan sifat loyal");
    }
}

class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move() {
        this.position += 2;
        System.out.println("Posisi: " + this.position);
    }

    void describe() {
        System.out.println("Deskripsi: tangguh, energetik, dan ramah, dengan bulu tebal dan mata yang menawan.");
    }
}

class Bulldog extends Dog {
    Bulldog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move() {
        this.position += 1;
    }

    void describe() {
        System.out.println("Deskripsi: tubuh yang berotot, kepala yang besar dengan rahang yang kuat, serta lipatan kulit yang khas di wajahnya, memiliki sifat yang tenang");
    }
}

class GermanSheperd extends Dog{
    GermanSheperd(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move() {
        this.position += 3;
    }

    void describe() {
        System.out.println("Deskripsi: berotot, berwajah serius, dan cerdas, dengan sifat yang penuh dedikasi, setia, dan mudah dilatih.");
    }
}

class Main1 {
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky(0, 76);
        siberianHusky.move();
        siberianHusky.describe();
        
    }
}