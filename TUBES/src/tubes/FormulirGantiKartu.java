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
public class FormulirGantiKartu {
    private String jenisAwal;
    private String jenisGanti;
    private String noKartu;
    
    public FormulirGantiKartu( Customer c, String jenisAwal, String jenisGanti, String noKartu ){
        
    }
    public String getJenisAwal(){
        return jenisAwal;
    }
    public void setJenisAwal(String jenisAwal){
        this.jenisAwal= jenisAwal;
    }
    public String getJenisGanti(){
        return jenisGanti;
    }
    public void setJenisGanti(String jeniGanti){
        this.jenisGanti=jenisGanti;
    }
    public String getNoKartu(){
        return noKartu;
    }
    public void setNoKartu(String noKartu){
        this.noKartu=noKartu;
    }
     public String getNama(Formulir f){
        return f.getNamaFormulir();
    }
    public String getNik(Formulir f){
        return f.getNikFormulir();
    }
    
}
