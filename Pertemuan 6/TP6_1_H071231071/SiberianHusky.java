public class SiberianHusky extends Dog implements Moveable {
    SiberianHusky(int averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    void describe() {
        System.out.println(
                "Siberian Husky dikenal dengan matanya yang biru atau cokelat yang menawan, memiliki bulu tebal dan rimbun yang cocok untuk iklim dingin. Siberian Husky sangat ramah, cerdas, dan suka berlari.");

    }

    @Override
    public void move() {
        this.position += 2;
        System.out.printf("Siberian Husky di posisi %d ke sebelah kanan", this.position);

    }

}
