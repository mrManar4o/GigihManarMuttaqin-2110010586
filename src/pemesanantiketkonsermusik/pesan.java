/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesanantiketkonsermusik;

/**
 *
 * @author acer
 */
public class pesan {
    private String no_pesan, no_tiket, no_id, jml_pesan, tgl_pesan, tot_hrg;
    
    public pesan () {}
    
     public void setNo_pesan(String no_pesan){
        this.no_pesan = no_pesan;
    }
    
    public String getNo_pesan (){
        return this.no_pesan;
    }
    
     public void setNo_tiket(String no_tiket){
        this.no_tiket = no_tiket;
    }
    
    public String getNo_tiket (){
        return this.no_tiket;
    }
    
     public void setNo_id(String no_id){
        this.no_id = no_id;
    }
    
    public String getNo_id (){
        return this.no_id;
    }
    
     public void setJml_pesan(String jml_pesan){
        this.jml_pesan = jml_pesan;
    }
    
    public String getJml_pesan (){
        return this.jml_pesan;
    }
    
     public void setTgl_pesan(String tgl_pesan){
        this.tgl_pesan = tgl_pesan;
    }
    
    public String getTgl_pesan (){
        return this.tgl_pesan;
    }
    
     public void setTot_hrg(String tot_hrg){
        this.tot_hrg = tot_hrg;
    }
    
    public String getTot_hrg (){
        return this.tot_hrg;
    }
}
