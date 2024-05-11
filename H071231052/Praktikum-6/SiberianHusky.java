public class SiberianHusky extends Dog implements Move{
    @Override
    void describe() {
        System.out.println("====== What the dog doin' [Siberian Husky] ======");
        System.out.println("   - Berasal dari Semenanjung Siberia dan dibesarkan oleh suku Chukchi.\r\n" + //
                        "   - Memiliki bulu yang tebal dan variasi warna yang indah pada bagian bulunya.\r\n" + //
                        "   - Ukuran tubuh sedang dengan tinggi badan ketika dewasa berkisar antara 43-53 cm dan berat badan antara 13-27 kg.\r\n" + //
                        "   - Telinganya berdiri tegak dengan lebar dibawah dan mengecil di atasnya.\r\n" + //
                        "   - Warna hidung disesuaikan dengan warna pada bulunya.\r\n" + //
                        "   - Memiliki warna mata mulai dari warna biru, kuning hingga warna coklat.\r\n" + //
                        "   - Ramah, manja, lembut, jinak dan bersahabat, sekalipun dengan orang yang belum dikenalnya.\r\n" + //
                        "   - Gemar melakukan aktivitas fisik, seperti lari jarak jauh.");
    }

    @Override
    public void move() {
        position += 2;
    }
    
}
