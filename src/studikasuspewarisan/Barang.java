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
class Barang {
    private int idBarang;
    private String namaBarang;
    public static int harga;
    private String merk;
    
public Barang(int idBarang, String namaBarang,int harga,String merk){
    this.idBarang = idBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
    this.merk = merk;
}

public void tampilkan(){
    System.out.println("Nama Kasir = Mas Kasir");
    System.out.println("Tgl = 02-08-2018");
    System.out.println(" ");
    System.out.println("<+=============================+>");
    System.out.println("ID Barang    : "+this.idBarang);
    System.out.println("Nama Barang  : "+this.namaBarang);
    System.out.println("Harga        : "+this.harga);
    System.out.println("Merk         : "+this.merk);
}

}
