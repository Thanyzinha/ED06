/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frase.java;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathany
 */
public class Pilha {
    String[] pilha1 = new String[25];
    String resultado = "";
    int topoPilha1 = 1;
    
    void push(int topo){
        String y = JOptionPane.showInputDialog(null, "digite o numero de frases que vão ser inseridas:");
        int x = Integer.parseInt(y);
        
        for(int i = x -1; i>=0; i--){
            this.topoPilha1 = topo;
            this.topoPilha1 ++;
            
        if(this.topoPilha1<0){
            this.topoPilha1 = 0;
        }
        if(this.topoPilha1>24){
             JOptionPane.showMessageDialog(null, "estouro de pilha! erro");
                this.topoPilha1--;
            }else {
             String text = JOptionPane.showInputDialog(null, "insira o texto:");
                this.pilha1[this.topoPilha1] = text;
                for(int j = text.length() - 1; j >= 0; j--){
                    resultado += text.charAt(j);
                }
                resultado += " "; 
        }
        }
         System.out.println(resultado);
    }
    
}
