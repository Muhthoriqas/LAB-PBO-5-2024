package Nomor1;

public class Persegi extends BangunDatar{
        double sisi;
        public void Luas(){
            luas = sisi * sisi;
        }
        public void Keliling(){
            keliling = 4 * sisi;
        }
}
                
class PersegiPanjang extends BangunDatar{
        double panjang, lebar;
        public void Luas(){
            luas = panjang * lebar;
        }
        public void Keliling(){
            keliling = 2 * (panjang + lebar);
        }
}
                
class Lingkaran extends BangunDatar{
        double jariJari;
                
        public void Luas(){
            luas = PI * (jariJari * jariJari);
        }
        public void Keliling(){
            keliling =  2 * PI * jariJari;
        }
}
                
class Trapesium extends BangunDatar{
        double a,b,c,d, tinggi; // A panjang atas, B panjang bawah, c panjang samping dan D panjang samping;
                    
        public void Luas(){
            luas = (1.0/2) * (a + b) * tinggi;
        }
        public void Keliling(){
            keliling = a+b+c+d;
        }
}
