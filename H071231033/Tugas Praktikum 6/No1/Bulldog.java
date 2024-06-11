package No1;

class Bulldog extends Dog  {
    public Bulldog(int position, int averagelenght){
        super(position, averagelenght);
    }
    @Override 
    public void move() {
        position +=1;
    }

    @Override
    void describe() {
        System.out.println("Posisi Bulldog sekarang berada di angka " + position );
        System.out.println("Panjang rata-rata Bulldog adalah " + averagelenght + " cm. ");
        System.out.println();
    }
}
