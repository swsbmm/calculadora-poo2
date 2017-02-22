/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author khond
 */
public class Calculo {
    //parametros de la clase calculo;

    int numero1 = 0, numero2 = 0, resultado = 0;

    //Metodos de la clase calculo;
    public Calculo() {
    }

    public void setNumero1(int valor) {
        numero1 = valor;
    }
    
    public int getNumero1()
    {
        return numero1;
    }

    public void setNumero2(int valor) {
        numero2 = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void sumar() {
        resultado = numero1 + numero2;
    }

    public void restar() {
        resultado = numero1 - numero2;
    }

    public void multiplicar() {
        resultado = numero1 * numero2;
    }

    public void dividir() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            resultado = 0;
        }
    }
}
