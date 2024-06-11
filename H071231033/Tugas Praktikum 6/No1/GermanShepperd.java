package No1;

class GermanShepperd extends Dog {

    public GermanShepperd(int position, int averagelenght) {
        super(position, averagelenght);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    void describe() {
        System.out.println("Posisi German Shepherd sekarang berada di angka "+ position );
        System.out.println("Panjang rata-rata German Shepherd adalah " + averagelenght + " cm.");
        System.out.println();
    }
}