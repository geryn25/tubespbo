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
public class Teller {
    private String passwordTeller;
    
    public Teller(String id, String nama, String alamat, String lama, String tgl, String password){
        
    }
    public String getId(Petugas p){
        return p.getIdPetugas();
    }
    public void setId(Petugas p,String id){
        p.setIdPetugas(id);
    }
    public String getNama(Petugas p){
        return p.getNamaPetugas();
    }
    public void setNama(Petugas p,String nama){
        p.setNamaPetugas(nama);
    }
    public String getAlamat(Petugas p){
        return p.getAlamatPetugas();
    }
    public void setAlamat(Petugas p,String alamat){
        p.setAlamatPetugas(alamat);
    }
    public int lamaBekerja(Petugas p){
        return p.getLamaBekerja();
    }
    public void setLamaBekerja(Petugas p,int lama){
        p.setLamaBekerja(lama);
    }
    public String getTanggalLahir(Petugas p){
        return p.getTglLahirPetugas();
    }
    public void setTglLahir(Petugas p, String tgl){
        p.setTglLahirPetugas(tgl);
    }
}
