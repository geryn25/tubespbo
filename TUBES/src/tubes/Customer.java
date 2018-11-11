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
public class Customer {
    private String nama;
    private String nik;
    private String noRek;
    private String alamat;
    private String pendidikan;
    private String noHp;
    private String tglLahir;
    private String wali;
    
    public Customer (String nama, String alamat, String pendidikan, String noHp, String tglLahir, String wali){
        
    }
    public Customer (String nama, String nik, String noRek, String alamat, String pendidikan, String noHp, String tglLahir, String wali){
        System.out.println("hello");
    }
    public Customer (String nama, String nik, String noRek, String prioritas, String alamat, String pendidikan, String noHp,String tglLahir, String wali){
        
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik=nik;
        
    }
    public String getPrioritas(){
        
        
    }
    public void setPrioritas(){
        .
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getPendidikan(){
        return pendidikan;
    }
    public String getNoHp(){
        return noHp;
    }
    public String getTglLahir(){
        return tglLahir;
    }
    public String getWali(){
        return wali;
    }
    
}
