public class Bulldog extends Dog implements Moveable {
    Bulldog(int averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    void describe() {
        System.out.println(
                "Bulldog punya kepala yang besar dan tubuh yang berotot serta wajah yang khas dengan lipatan kulit yang melimpah di sekitar mata dan hidung.");

    }

    @Override
    public void move() {
        this.position += 1;
        System.out.printf("Bulldog di posisi %d ke sebelah kanan", this.position);

    }

}