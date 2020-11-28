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
class Tabung implements BangunRuang {
 private int r,tinggi;
 //tinggi = 21 r = 10
 public Tabung(int r, int tinggi) {
     this.r = r;
     this.tinggi = tinggi;
 }
  @Override
  public double hitungVolume() {
      return 3.14285714286*(r*r)*tinggi;
 }
 @Override
 public void tampilBangunRuang(){
     System.out.printf("Hasil : V = %.1f%n", hitungVolume());
 }
}
