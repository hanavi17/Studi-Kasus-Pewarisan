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
class Transaksi extends Pembeli{
    private static int jml;
    
    public Transaksi(int idBarang, String namaBarang, int harga, String merk, int idPembeli, String namaPembeli, 
            String alamat, String notelp, int jml) {
        super(idBarang, namaBarang, harga, merk, idPembeli, namaPembeli, alamat, notelp);
        this.jml = jml;
    }
    
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Jumlah Barang: "+this.jml);
    }
    
    public static void main(String[] args) {
        Transaksi tr = new Transaksi(18 ,"Bolpoin",10000,"Standard",22,"Jarwo","Jl.ranau","085236393512",2);
        tr.tampilkan();
        System.out.println("Total harga  : " + (harga * jml));
        System.out.println("<+==============================+>");
    }
    
}
