/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author nadye
 */
public class Corrente extends Conta {
    private double tarifa;

    public Corrente(int numero, double saldo, double tarifa) {
        super(numero, saldo);
        this.tarifa = tarifa;
    }
    
    public void debitaTarifa(){
        
    }

    @Override
    public String toString() {
        return "Corrente{" + "tarifa=" + tarifa + '}';
    }
    
    
    
}
