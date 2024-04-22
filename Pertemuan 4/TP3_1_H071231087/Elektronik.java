public class Elektronik {
    String namaToko;
    int harga, sisauang;
    int id;
    Merek merek = new Merek();

    public Elektronik() {
    }

    public Elektronik(String namaToko, int harga, int id, Merek merek) {
        this.namaToko = namaToko;
        this.harga = harga;
        this.id = id;
        this.merek = merek;
    }

    public void getInfoBarang() {
        System.out.println("=============== Info Barang ===================");
        System.out.println("Nama Toko: " + namaToko);
        System.out.println("Harga: " + harga);
        System.out.println("ID: " + id);
        merek.getInfoMerek();
    }

    public void beliDong(int money) {
        System.out.println(harga);
        System.out.println(money);
        if (money >= harga) {
            setSisaUang(money -=  harga);;
            System.out.println("============ Pembelian berhasil ============");
        } else {
            System.out.println("===== Maaf, uang Anda tidak cukup untuk membeli barang ini =====");
        }
    }

    public void beliBarangtokolain(Elektronik elektronik) {
        int hargaBarangTokoLain = elektronik.harga;

        System.out.println(getSisaUang());
        System.out.println(hargaBarangTokoLain);
        if (getSisaUang() >= hargaBarangTokoLain) {
            System.out.println("===== Pembelian dari toko "+ elektronik.getNamaToko() +" berhasil =====");
        } else {
            System.out.println("===== Maaf, uang Anda tidak cukup untuk membeli barang ini =====");
        }
    }

    public String getNamaToko() {
        return namaToko;
    }
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setSisaUang(int sisaUang) {
        this.sisauang = sisaUang;
    }
    public int getSisaUang() {
        return sisauang;
    }

    public Merek getMerek() {
        return merek;
    }
    public void setMerek(Merek merek) {
        this.merek = merek;
    }
}