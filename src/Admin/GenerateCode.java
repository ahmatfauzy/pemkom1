/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import UILogin.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Admin.TambahProduk1;
import static Admin.TambahProduk1.txtNama;

/**
 *
 * @author FAUZI
 */
public class GenerateCode {
    public static void generateCode() {
        try {
            Connection K = Koneksi.Go();
            String Q = "SELECT produk_kode AS kode FROM produk ORDER BY ID DESC LIMIT 1;";
            Statement ST = K.createStatement();
            ResultSet R = ST.executeQuery(Q);
            String kode = "";
            while (R.next()) {                
                kode = R.getString("kode");
            }
            
            int P = Integer.parseInt(kode.substring(1));
            String newCode = "";
            if(P < 10){
                newCode = "P0000"+(P+1);
            }else if(P>9 && P < 100){
                newCode = "P000"+(P+1);
            }else if(P>99 && P < 1000){
                newCode = "P00"+(P+1);
            }else if(P>999 && P < 10000){
                newCode = "P0"+(P+1);
            }else if(P>9999 && P < 10000){
                newCode = "P"+(P+1);
            }
            txtNama.setText(newCode); 
            
        } catch (Exception e) {
        }
    
    }
}
