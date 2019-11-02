/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author nadye
 */
public class Agencia {

    ArrayList<Conta> contas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    
    public void menu(){
        int op;
        System.out.println("--------Menu--------");
        System.out.println("1-Criar Conta");
        System.out.println("2-Acessar Conta");
        System.out.println("3-Sair");
        System.out.println("--------------------");
        System.out.print(">");
        op = entrada.nextInt();
        switch(op){
            case 1:
             //Criar conta
                criarConta();
                break;
            case 2:
                //Acessar Conta
                acessarConta();
                break;
            case 3:
                //sair
                System.out.println("Obrigado pela sua preferencia!");
                break;
            default:
                System.out.println("Opção inexistente");
                break;
        }
    }
    private void criarConta(){
        
        System.out.println("--------Criar Conta--------");
        System.out.println("1-Conta Corrente");
        System.out.println("2-Conta Poupança");
        System.out.println("3-Voltar");
        System.out.println("---------------------------");
        System.out.print(">");
        int opc = entrada.nextInt();
        
        switch(opc){
            case 1:
             //Conta Corrente
              System.out.print("Numero da Conta\n>");
                int numb = entrada.nextInt();
                System.out.print("Saldo da Conta\n>");
                double saldo = entrada.nextDouble();
                System.out.print("Rendimento Da conta\n>");
                double tarif = entrada.nextDouble();
                contas.add(new Corrente(numb, saldo, tarif));
                break;
            case 2:
                //Conta Poupança
                System.out.print("Numero da Conta\n>");
                int number = entrada.nextInt();
                System.out.print("Saldo da Conta\n>");
                double sald = entrada.nextDouble();
                System.out.print("Rendimento Da conta\n>");
                double render = entrada.nextDouble();
                contas.add(new Poupanca(number, sald, render));

                break;
            case 3:
                //Voltar
                menu();
                break;
            default:
                System.out.println("Opção inexistente");
                break;
            
        }
       
    }
    
    private boolean existeConta(int numero){
        return true;
    }
    private void acessarConta(/* int numero  //sempre buga essa parte kks*/){
        
    }
    
}
