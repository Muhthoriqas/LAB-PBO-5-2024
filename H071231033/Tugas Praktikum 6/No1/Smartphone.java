package No1;

class Smartphone implements Perpindahan {
    int price;
    String brand;
    
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone " + brand + "dengan harga Rp " + price + " telah berpindahan tangan ");
        System.out.println();
    }
    
}
