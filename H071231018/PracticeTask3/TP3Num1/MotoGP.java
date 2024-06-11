class MotoGP{
    String nama;
    Motor motor;

    public MotoGP(String nama, Motor motor) {
        this.nama = nama;
        this.motor = motor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String info() {
        return "Nama: " + nama + "\n   Motor: " + motor.getBrand();
    }

    public String getInfo(){
        return "Nama: " + nama + "\n   Motor: " + motor.getBrand() + "\n   Top Speed: " + motor.getTopSpeed() + " km/h";
    }

    public void daftar(String newDriverName, Motor newMotor){
        this.nama = newDriverName;
        this.motor = newMotor;
    }

    public void balapWoo(MotoGP target) {
        if (this.getMotor().getTopSpeed() > target.getMotor().getTopSpeed()) {
            System.out.println("Top speed " + this.getNama() + " adalah " +this.getMotor().getTopSpeed() + "\nTop speed " + target.getNama() + " adalah " + target.getMotor().getTopSpeed() + "\n" + this.getNama() + " Win");
        } else if (this.getMotor().getTopSpeed() < target.getMotor().getTopSpeed()) {
            System.out.println("Top speed " + this.getNama() + " adalah " + this.getMotor().getTopSpeed() + "\nTop speed " + target.getNama() + " adalah " + target.getMotor().getTopSpeed() + "\n" + target.getNama() + " Win");
        } else {
            System.out.println("seri");
        }
    }
}
