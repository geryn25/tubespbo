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
public class Administrator {
    private String userName;
    private String password;
    private CustomerService [] daftarCS;
    private Teller [] daftarTeller;
    private int jumTeller;
    private int jumCS;
    
    public Administrator(String userName, String password){
        this.userName=userName;
        this.password=password;
    }
    public void addCustomer(CustomerService CS, String password){
        
    }
    public void addTeller(Teller Teller, String password){
        
    }
    public void removeCS(CustomerService CS){
        
    }
    public void removeTeller(Teller Teller){
        
    }
}
