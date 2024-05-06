public class Main1 {
    public static void main(String[] args) {
        Avengers av1 = new Avengers("Thor", "God of Thunder", 50);
        Avengers av2 = new Avengers("Thanos", "Titan", 40);

        av1.info();
        System.out.println("================ VS ===================");
        av2.info();

        System.out.println();
        av1.battle(av2);
        System.out.println();
        av2.battle(av1);
    }
}
