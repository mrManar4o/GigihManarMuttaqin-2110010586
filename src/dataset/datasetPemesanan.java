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
public class datasetPemesanan {
    private ArrayList<String> noid;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    private ArrayList<String> wilayah;
    private ArrayList<String> fax; 
    private ArrayList<String> email; 
    
    public datasetPemesanan(){
        noid = new ArrayList<>();
        nama = new ArrayList<>();
        alamat = new ArrayList<>();
        telp = new ArrayList<>();
        wilayah = new ArrayList<>();
        fax = new ArrayList<>();
        email = new ArrayList<>();
        
    }
    
     public void addNoid(String value){
        this.noid.add(value);
    }
    
    public ArrayList<String> getDataNoid(){
        return this.noid;
    }
    
     public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
     public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
     public void addTelp(String value){
        this.telp.add(value);
    }
    
    public ArrayList<String> getDataTelp(){
        return this.telp;
    }
    
     public void addWilayah(String value){
        this.wilayah.add(value);
    }
    
    public ArrayList<String> getDataWilayah(){
        return this.wilayah;
    }
    
     public void addFax(String value){
        this.fax.add(value);
    }
    
    public ArrayList<String> getDataFax(){
        return this.fax;
    }
    
     public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getDataEmail(){
        return this.email;
    }
    
    public void TambahBarang(String noid, String nama, String alamat,
            String telp, String fax, String email){
        addNoid(noid);
        addNama(nama);
        addAlamat(alamat);
        addTelp(telp);
        addFax(fax);
        addEmail(email);
    }
}
