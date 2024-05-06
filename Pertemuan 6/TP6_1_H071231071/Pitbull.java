public class Pitbull extends Dog implements Moveable {
    Pitbull(int averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    void describe() {
        System.out.println(
                "Pitbull anjing yang kuat, berani, tubuh yang solid dan otot yang terdefinisi dengan baik. Pitbull memiliki kepala yang lebar, telinga yang tegak, dan bulu yang pendek dan rapat.");

    }

    @Override
    public void move() {
        this.position += 3;
        System.out.printf("Ptibull di posisi %d ke sebelah kanan", this.position);

    }

}
