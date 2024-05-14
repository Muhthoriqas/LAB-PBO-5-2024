package Nomor1;

public class Kubus extends BangunRuang{
                    double sisi;
                    public void Luas(){
                        luas = 6 * (sisi * sisi);
                    }
                    public void Volume(){
                        volume = sisi * sisi * sisi;
                    }
                }
                
                class Balok extends BangunRuang{
                    double panjang, lebar, tinggi;
                    public void Luas(){
                        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
                    }   
                    public void Volume(){
                        volume = panjang * lebar * tinggi;
                    }
                }
                
                class Bola extends BangunRuang{
                    double jariJari;
                    public void Luas(){
                        luas = 4 * PI * (jariJari * jariJari);
                    }
                
                    public void Volume(){
                        volume = (4.0/3) * PI * (jariJari * jariJari * jariJari);
                    }
                }
                
                class Tabung extends BangunRuang{
                    double jariJari, tinggi;
                
                    public void Luas(){
                        luas = 2 * PI * jariJari * (jariJari + tinggi);
                    }
                
                    public void Volume(){
                        volume = 2 * PI * jariJari * jariJari * tinggi;
                    }   
}
