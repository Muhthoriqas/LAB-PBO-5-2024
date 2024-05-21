
public abstract class Dog{
    int position = 0;
    int averageLegth;

    abstract void describe();

}
class Pitbull extends Dog implements Move{
    int averageLegth = 50;
    
    public void move() {
        this.position = +3;
        System.out.printf("Pitbull is moving to position %d\n",this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri : \nTubuh kuat dan berotot\nKepala lebar dan tegak berbentuk segi empat\nberbadan pendek dan kaki yang kuat");
    }

}

class SiberianHusky extends Dog implements Move {
    int averageLegth = 100;

    public void move() {
        this.position = +2;
        System.out.printf("Siberian Husky is moving to position %d\n",this.position);

    }

    @Override
    void describe() {
        System.out.println("Ciri : \nBerbulu tebal dengan warna mata biru");
    }

}

class Bulldog extends Dog implements Move {
    int averageLegth = 50;

    public void move() {
        this.position = +1; 
        System.out.printf("Bulldog is moving to position %d\n",this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri : \nLebar dan besar, telinganya berbentuk seperti mawar, kecil dan tipis");
    }

}
class GermanShepherd extends Dog implements Move{
    int averageLegth = 50;

    public void move() {
        this.position = +3 ;
        System.out.printf("German Shepherd is moving to position %d\n",this.position);
        
    }

    @Override
    void describe() {
        System.out.println("Ciri : \nBentuk tubuh yang proporsional dan agak memanjang. Memiliki otot serta struktur tulang yang solid. Warna mata gelap dan berbentuk almond. Telinga berdiri tegak, lebar dibawah dan mengerucut ke atas.");
    }

}