class Projek {
    private int ProjekBerjalan;

    public void setLamaProjek(int lamaProjek) {
        this.ProjekBerjalan = lamaProjek;
    }

    public int getLamaProjek() {
        return ProjekBerjalan;
    }

    void menuPengalaman(){
        System.out.println("Projek IT: ");
        System.out.println("1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15");
    }

    void pengalamanProjek(int pilihan){
        switch (pilihan) {
            case 1:
                setLamaProjek(4);
                break;
            case 2:
                setLamaProjek(8);
                break;
            case 3:
                setLamaProjek(12);
                break;
            case 4:
                setLamaProjek(15);
                break;
        }
    }
}
