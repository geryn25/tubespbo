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
public class FormulirBukaRekening {
    private String jenisRekening;
    private double setoranAwal;
    
    public FormulirBukaRekening(Customer c, String jenisRekening, double setoranAwal){
        
    }
    public String getJenisRekening(){
        return jenisRekening;
        
    }
    public void setJenisRekening(String jenisRekening){
        this.jenisRekening=jenisRekening;
    }
    public double getSetoranAwal(){
        return setoranAwal;
    }
    public void setSetoranAwal(double setoranAwal){
        this.setoranAwal=setoranAwal;
    }
     public String getNama(Formulir f){
        return f.getNamaFormulir();
    }
    public String getNik(Formulir f){
        return f.getNikFormulir();
    }
}
