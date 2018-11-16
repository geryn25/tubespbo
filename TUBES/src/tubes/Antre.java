/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author YAHYA
 */
import java.util.*;
public class Antre {
    private String jenisAntre;
    private String tanggalAntre;
    private String noAntre;
    private List<String> List;
    private int jumlahAntre;
    public Antre(String jenisAntre, String tglAntre){
        this.jenisAntre=jenisAntre;
        this.tanggalAntre=tglAntre;
        List=new ArrayList();
    }
    public void addAntre(){
        
    }
    public void delAntre(){
        
    }
    public void setJumlahAntre(int jum){
        this.jumlahAntre=jum;
    }
    public void setJenisAntre(String jenis){
        this.jenisAntre=jenis;
    }
    public int getJumlahAntre(){
        return jumlahAntre;
    }
    public String getJenisAntre(){
        return jenisAntre;
    }
    public String getTanggalAntre(){
        return tanggalAntre;
    }
    public String getNoAntre(){
        return noAntre;
    }
    public void setTanggalAntre(String tgl){
        this.tanggalAntre=tgl;
    }
    public void setNoAntre(String nomor){
        this.noAntre=nomor;
    }
    
}
