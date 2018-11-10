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
public class FormulirKehilangan {
    private String sebabKehilangan;
    private String tanggalKehilangan;
    private String jamKehilangan;
    
    public FormulirKehilangan( Customer c, String sebebKehilangan, String jamKehilangan, String tanggalKehilangan){
        
    }
    public String getSebabKehilangan(){
        return sebabKehilangan;
    }
    public void setSebabKehilangan(String sebebKehilangan){
        this.sebabKehilangan=sebebKehilangan;
    }
    public String getTanggalKehilangan(){
        return tanggalKehilangan;
    }
    public void setTanggalKehilangan(String tanggalKehilangan){
        this.tanggalKehilangan=tanggalKehilangan;
    }
    public String getJamKehilangan(){
        return jamKehilangan;
    }
    public void setJamKehilangan(String jamKehilangan){
        this.jamKehilangan=jamKehilangan;
    }
     public String getNama(Formulir f){
        return f.getNamaFormulir();
    }
    public String getNik(Formulir f){
        return f.getNikFormulir();
    }
}
