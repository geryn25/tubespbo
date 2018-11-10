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
public class FormulirSetorTarik {
    private boolean isWithdraw;
    private double jumlahSetorTarik;
    private String berita;
    
    public FormulirSetorTarik(Customer c, boolean isWithdraw, double jumlah, String berita){
        
    }
    public double getJumlahSetorTarik(){
        return jumlahSetorTarik;
    }
    public void setJumlahSetorTarik(double jumlah){
        this.jumlahSetorTarik=jumlah;
    }
    public String getNama(Formulir f){
        return f.getNamaFormulir();
    }
    public String getNik(Formulir f){
        return f.getNikFormulir();
    }
    public boolean getTarikSetor(){
        return isWithdraw;
    }
    public void setTarikSetor(boolean isWithdraw){
        this.isWithdraw=isWithdraw;
    }
    public String getBerita(){
        return berita;
    }
    public void setBerita(String berita){
        this.berita=berita;
    }
}
