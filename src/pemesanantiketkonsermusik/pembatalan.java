/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesanantiketkonsermusik;

/**
 *
 * @author acer
 */
public class pembatalan {
      private String no_id, no_pesan, no_tiket, konfirmasi, jml_pesan, tgl_pesan;
    
    public pembatalan () {}
    
    public void setNo_tiket (String no_tiket){
        this.no_tiket = no_tiket;
    }
    
    public String getNo_tiket (){
        return this.no_tiket;
    }
    
    public void setNo_id (String no_id){
        this.no_id = no_id;
    }
    
    public String getNo_id (){
        return this.no_id;
    }
    
    public void setNo_pesan (String no_pesan){
        this.no_pesan = no_pesan;
    }
    
    public String getNo_pesan (){
        return this.no_pesan;
    }
    
    public void setKonfirmasi (String konfirmasi){
        this.konfirmasi = konfirmasi;
    }
    
    public String getKonfirmasi (){
        return this.konfirmasi;
    }
    
    public void setJml_pesan (String jml_pesan){
        this.jml_pesan = jml_pesan;
    }
    
    public String getJml_pesan (){
        return this.jml_pesan;
    }
    
    public void setTgl_pesan (String tgl_pesan){
        this.tgl_pesan = tgl_pesan;
    }
    
    public String getTgl_pesan (){
        return this.tgl_pesan;
    }
    
}
