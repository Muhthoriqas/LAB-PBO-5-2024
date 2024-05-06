public class GermanShepherd extends Dog implements Move{

    @Override
    void describe() {
        System.out.println("====== What the dog doin' [GermanShepherd] ======");
        System.out.println("   - Memiliki struktur tubuh yang agak memanjang, proporsional, berotot dan memiliki struktur tulang yang solid.\r\n" + //
                        "   - Hidung umumnya berwarna hitam.\r\n" + //
                        "   - Mata berwarna gelap dan berbentuk almond.\r\n" + //
                        "   - Telinganya berdiri tegak, lebar dibawah dan mengecil di atasnya.\r\n" + //
                        "   - Memiliki bulu yang pendek, lurus, halus serta mengkilap.\r\n" + //
                        "   - Energi tinggi dan suka berlarian atau bermain bola.\r\n" + //
                        "   - Cerdas dan mudah dilatih.\r\n" + //
                        "   - Patuh dan setia kepada majikannya.\r\n" + //
                        "   - Pemberani dan sering mengacak-acak rumah.\r\n" + //
                        "   - Bandel dan agak cerewet.\r\n" + //
                        "   - Sensitif terhadap kebersihan.");
    }

    @Override
    public void move() {
        position += 3;
    }
    
}
