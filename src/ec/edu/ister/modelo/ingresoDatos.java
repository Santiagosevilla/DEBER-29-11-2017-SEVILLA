/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO27
 */
public class ingresoDatos {
    int valores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos valores desea ingresar?"));
        int numeros[]=new int[valores];
        public void ingresovalores(){
            for (int i = 0; i < numeros.length; i++) {
                numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
            }
        }
        public void verificacion(){
            int min,max;
            min=max=numeros[0];
            for (int i = 0; i < numeros.length; i++) {
                if(min>numeros[i]){
                    min=numeros[i];
                }
                if(max<numeros[i]){
                    max=numeros[i];
                }
            }
            JOptionPane.showMessageDialog(null,"El máximo es " + max + " y el minimo es " + min);
        }
}
