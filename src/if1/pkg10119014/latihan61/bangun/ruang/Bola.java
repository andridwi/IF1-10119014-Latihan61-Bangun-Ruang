/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan61.bangun.ruang;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
class Bola implements BangunRuang {
    private int r;
  // r = 7
    public Bola(int r){
        this.r = r;
    }
    @Override
    public double hitungVolume() {
        return (4.0/3.0)*3.14285714286*(r*r*r);  
    }
    @Override
    public void tampilBangunRuang(){
    System.out.printf("Hasil : V = %.1f%n", hitungVolume());
}
}

