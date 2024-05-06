public class Bulldog extends Dog implements Move{

    @Override
    void describe() {
        System.out.println("====== What the dog doin' [Bulldog] ======");
        System.out.println("   - Memiliki tubuh lebar dan besar.\r\n" + //
                        "   - Moncongnya pesek.\r\n" + //
                        "   - Kakinya pendek serta mempunyai ekstra kulit yang jatuh berlipat.\r\n" + //
                        "   - Hidungnya berwarna hitam dengan lubang hidung yang nampak besar.\r\n" + //
                        "   - Memiliki bentuk telinga seperti mawar kecil dan tipis.\r\n" + //
                        "   - Bulunya pendek, lurus, halus serta mengkilap.\r\n" + //
                        "   - Energi tinggi dan suka berlarian atau bermain bola.\r\n" + //
                        "   - Cerdas dan mudah dilatih.\r\n" + //
                        "   - Patuh dan setia kepada majikannya.\r\n" + //
                        "   - Pemberani dan sering mengacak-acak rumah.\r\n" + //
                        "   - Bandel dan agak cerewet.\r\n" + //
                        "   - Sensitif terhadap kebersihan.");
    }

    @Override
    public void move() {
        position += 1;
    }
    
}
