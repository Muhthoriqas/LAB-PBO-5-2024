abstract class Dog implements Move {
    int position, averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    // public abstract void move();
    public abstract void describe();

    void display(){
        System.out.println("tesss");
    }
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);

    }

    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Tubuh kekar, dada dalam, kepala persegi, dan sifat yang galak.");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Siberian Husky dikenal memiliki tingkat aktivitas yang tinggi dan tidak bisa diam.");
    }
    
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);

    }

    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Ramah dengan anak-anak, maskot sekolah, dan anjing keluarga yang baik");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("German Shepherd berpindah sejauh " + position + " titik");
    }

    public void describe() {
        System.out.println("Tubuh besar, kuat, kepala berbentuk kotak, dan telinga berdiri tegak.");
    }
    
}