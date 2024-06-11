package No1;

class SiberianHuskky extends Dog {
    public SiberianHuskky (int position, int averagelenght ) {
        super (position, averagelenght);
    }
    
    @Override
    public void move(){
        position += 2;
    }

    @Override
    void describe(){
        System.out.println("Posisi Siberian Huskky sekarang berada di angka " + position);
        System.out.println("Panjang rata-rata Siberian Huskky " + averagelenght + " cm. ");
        System.out.println();
    }
    
}
