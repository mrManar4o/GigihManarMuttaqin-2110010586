/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class datasetPembatalan {
    private ArrayList<String> no_pesan;
    private ArrayList<String> no_id;
    private ArrayList<String> no_tiket;
    private ArrayList<String> konfirmasi;
    private ArrayList<String> tgl_pesan;
    private ArrayList<String> jml_pesan; 
    
    public datasetPembatalan(){
        no_tiket = new ArrayList<>();
        no_id = new ArrayList<>();
        no_pesan = new ArrayList<>();
        konfirmasi = new ArrayList<>();
        tgl_pesan = new ArrayList<>();
        jml_pesan = new ArrayList<>();
        
    }
    
     public void addNo_tiket(String value){
        this.no_tiket.add(value);
    }
    
    public ArrayList<String> getDataNo_tiket(){
        return this.no_tiket;
    }
    
     public void addNo_id(String value){
        this.no_id.add(value);
    }
    
    public ArrayList<String> getDataNo_id(){
        return this.no_id;
    }
    
     public void addNo_pesan(String value){
        this.no_pesan.add(value);
    }
    
    public ArrayList<String> getDataNo_pesan(){
        return this.no_pesan;
    }
    
     public void addKonfirmasi(String value){
        this.konfirmasi.add(value);
    }
    
    public ArrayList<String> getDataKonfirmasi(){
        return this.konfirmasi;
    }
    
     public void addTgl_pesan(String value){
        this.tgl_pesan.add(value);
    }
    
    public ArrayList<String> getDataTgl_pesan(){
        return this.tgl_pesan;
    }
    
     public void addJml_pesan(String value){
        this.jml_pesan.add(value);
    }
    
    public ArrayList<String> getDataJml_pesan(){
        return this.jml_pesan;
    }
    
     public void TambahBarang(String no_tiket, String no_id, String no_pesan,
            String konfirmasi, String tgl_pesan, String jml_pesan){
        addNo_tiket(no_tiket);
        addNo_id(no_id);
        addNo_pesan(no_pesan);
        addKonfirmasi(konfirmasi);
        addTgl_pesan(tgl_pesan);
        addJml_pesan(jml_pesan);
    }
    
}
