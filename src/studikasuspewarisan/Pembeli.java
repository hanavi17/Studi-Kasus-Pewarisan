/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasusPewarisan;



/**
 *
 * @author USER
 */
class Pembeli extends Barang{
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String notelp;
    
    
    public Pembeli(int idBarang, String namaBarang, int harga, String merk, int idPembeli, 
            String namaPembeli, String alamat, String notelp) {
        super(idBarang, namaBarang, harga, merk);
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    public void tampilkan(){
        super.tampilkan();
        System.out.println("ID pembeli   : "+this.idPembeli);
        System.out.println("Nama Pembeli : "+this.namaPembeli);
        System.out.println("Alamat       : "+this.alamat);
        System.out.println("No Telepon   : "+this.notelp);
    }
}
