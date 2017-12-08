/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ingresoDatos;

/**
 *
 * @author SANTIAGO27
 */
public class aplicacion {
    public static void main(String[] args) {
        ingresoDatos dato1= new ingresoDatos();
        dato1.ingresovalores();
        dato1.verificacion();
    }
}
