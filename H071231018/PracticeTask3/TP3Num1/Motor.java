class Motor {
    String brand;
    double topSpeed;

    public Motor(String brand, double topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void upgradeMotor(double newTopSpeed) {
        this.topSpeed = newTopSpeed;
    }

    public void gantiMotor(String newBrand, double newTopSpeed) {
        this.brand = newBrand;
        this.topSpeed = newTopSpeed;
    }
}