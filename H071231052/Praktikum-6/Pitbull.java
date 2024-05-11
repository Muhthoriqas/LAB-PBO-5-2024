public class Pitbull extends Dog implements Move{
    @Override
    void describe() {
        System.out.println("====== What the dog doin' [Pitbull] ======");
        System.out.println("   - Memiliki banyak jenis, termasuk American Staffordshire Terrier, Staffordshire Bull Terrier, American Pit Bull Terrier, Dogo Argentino, dan berbagai ras campuran lainnya.\r\n" + //
                        "   - Memiliki tubuh yang berotot dan gagah, serta fisik dan mental yang kuat.\r\n" + //
                        "   - Rahangnya kuat dan jika ia menggigit, akan sangat sulit melepasnya karena gigitannya bersifat mengunci.\r\n" + //
                        "   - Sangat setia kepada majikannya dan akan selalu berusaha melindungi.\r\n" + //
                        "   - Memiliki sifat yang keras kepala dan sulit dikontrol.\r\n" + //
                        "   - Ramah terhadap anak-anak.\r\n" + //
                        "   - Tidak menyerang tanpa sebab.");
    }

    @Override
    public void move() {
        position += 3;
    }
    
}
