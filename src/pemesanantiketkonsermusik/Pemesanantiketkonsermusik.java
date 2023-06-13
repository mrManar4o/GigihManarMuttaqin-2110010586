/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemesanantiketkonsermusik;

import forms.formUtama;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Pemesanantiketkonsermusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          pemesanan obj = new pemesanan();
          obj.setNama("gigih");
          System.out.println("Nama :"+obj.getNama());
        
          ArrayList<String> no_tiket = new ArrayList<>();
        no_tiket.add("1");
        no_tiket.add("2");
        no_tiket.add("3");
        no_tiket.add("4");
        
        System.out.println(String.valueOf(no_tiket.size()));
        System.out.println(no_tiket.get(3));
        
        new formUtama().setVisible(true);
    
    }
    
}
