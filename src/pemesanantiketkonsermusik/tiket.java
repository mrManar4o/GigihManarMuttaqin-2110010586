/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesanantiketkonsermusik;

/**
 *
 * @author acer
 */
public class tiket {
    private String no_tiket, kelas, harga, judulkonser;
    
    public tiket () {}
    
    public void setNo_tiket(String no_tiket){
        this.no_tiket = no_tiket;
    }
    
    public String getNo_tiket (){
        return this.no_tiket;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getKelas (){
        return this.kelas;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
    
    public String getHarga (){
        return this.harga;
    }
    
    public void setJudulkonser(String judulkonser){
        this.judulkonser = judulkonser;
    }
    
    public String getJudulkonser (){
        return this.judulkonser;
    }
    
}
