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
public class FormulirTransfer {
    private double jumlahTransfer;
    private String rekTujuan;
    private String bankTujuan;
    
    public FormulirTransfer(Customer c, double jumlah, String rekTujuan, String bankTujuan){
        
    }
    public String getNama(Formulir f){
        return f.getNamaFormulir();
    }
    public String getNik(Formulir f){
        return f.getNikFormulir();
        
    }
    public double getJumlahTransfer(){
        return jumlahTransfer;
    }
    public void setJumlahTransfer(int jumlah){
        this.jumlahTransfer= jumlah;
    }
    public String getRekTujuan(){
        return rekTujuan;
    }
    public void setRekTujuan(String rekTujuan){
        this.rekTujuan=rekTujuan;
    }
    public String getBankTujuan(){
        return bankTujuan;
    }
    public void setBankTujuan(String bankTujuan){
        this.bankTujuan=bankTujuan;
    }
    
}
