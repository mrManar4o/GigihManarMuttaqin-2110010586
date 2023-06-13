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
public class datasetTiket {
    private ArrayList<String> kelas;
    private ArrayList<String> no_tiket;
    private ArrayList<String> harga;
    private ArrayList<String> judulkonser;
 
     public datasetTiket(){
        kelas = new ArrayList<>();
        no_tiket = new ArrayList<>();
        harga = new ArrayList<>();
        judulkonser = new ArrayList<>();
       
    }
     
    public void addNo_tiket(String value){
        this.no_tiket.add(value);
    }
    
    public ArrayList<String> getDataNo_tiket(){
        return this.no_tiket;
    }
    
    public void addKelas(String value){
        this.kelas.add(value);
    }
    
    public ArrayList<String> getDataKelas(){
        return this.kelas;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
    
    public void addJudulkonser(String value){
        this.judulkonser.add(value);
    }
    
    public ArrayList<String> getDataJudulkonser(){
        return this.judulkonser;
    }
}
