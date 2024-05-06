public class GermanShepherd extends Dog implements Moveable {
    GermanShepherd(int averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    void describe() {
        System.out.println(
                "German Shepherd memiliki tubuh yang atletis dengan bulu berwarna coklat kehitaman. Dia juga anjing yang cerdas, penuh energi, dan sangat setia.");

    }

    @Override
    public void move() {
        this.position += 3;
        System.out.printf("German Shepherd di posisi %d ke sebelah kanan", this.position);

    }

}
