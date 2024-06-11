package TPNum1;

abstract class Dog {
    int position = 0;
    int averageLength;
    abstract void move();
    abstract void describe();
}

class Pitbull extends Dog{
    @Override
    public void move(){
        this.position += 3;
        System.out.println("Anjing berpindah sebanyak: " + this.position);
    }

    @Override
    public void describe(){
        System.out.println("Jenis       : Pitbull");
        System.out.println("Bentuk tubuh: Berotot");
        System.out.println("Ukuran bulu : Pendek");
        System.out.println("Warna bulu  : Merah, coklat, hitam, putih, dan campuran berbagai warna.");
        System.out.println("Tinggi bahu : 43-53 cm");
        System.out.println("Berat badan : 13-36 kg");
    }
}

class SiberianHusky extends Dog{
    @Override
    public void move(){
        this.position += 2;
        System.out.println("Anjing berpindah sebanyak: " + this.position);
    }

    @Override
    public void describe(){
        System.out.println("Jenis       : Siberian Husky");
        System.out.println("Ciri khas   : Tubuh mirip serigala");
        System.out.println("Berat badan : 16-27 kg");
        System.out.println("Tinggi badan: 51-60 cm");
        System.out.println("Warna bulu  : Hitam dan putih, abu-abu, putih, hitam, hitam dan cokelat, perak, kehitaman dan putih, abu-abu dan putih, merah dan putih");
        System.out.println("Ukuran      : Sedang");
    }
}

class Bulldog extends Dog{
    @Override
    public void move(){
        this.position += 1;
        System.out.println("Anjing berpindah sebanyak: " + this.position);
    }

    @Override
    public void describe(){
        System.out.println("Jenis       : Bulldog");
        System.out.println("Ciri khas   : Kulit lentur terutama dibagian kepala, leher dan bahu.");
        System.out.println("Berat badan : 23-25 kg");
        System.out.println("Tinggi badan: 31- 36 cm");
        System.out.println("Warna bulu  :  belang-belang, merah, coklat kekuningan atau putih dengan salah satu warna yang disebutkan di atas");    }
}

class GermanShepherd extends Dog{
    @Override
    public void move(){
        this.position +=3;
        System.out.println("Anjing berpindah sebanyak: " + this.position);
    }

    @Override
    public void describe(){
        System.out.println("Jenis       : German Shepherd");
        System.out.println("Bentuk tubuh: Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid. Telinganya berdiri tegak dengan lebar di bawah dan mengecil di atasnya.");
        System.out.println("Berat badan : 34-43 kg");
        System.out.println("Tinggi badan: 57,5-62,5 cm");
        System.out.println("Warna bulu  : Black/tan, gold, light gray, sable");
    }
}

