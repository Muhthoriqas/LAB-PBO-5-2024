package No1;

class Pitbul extends Dog {
    public Pitbul(int position, int averagelenght){
        super(position, averagelenght);
    }
    
    @Override
    public void move(){
        position +=3;
    }

    @Override
    void describe(){
        System.out.println("Posisi pitbull sekarang berada di angka " + position);
        System.out.println("Panjang rata-rata pitbull adalah " + averagelenght + " cm. ");
        System.out.println();
    }
}
