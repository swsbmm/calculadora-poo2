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
public class CalculoBinario extends Calculo{
    public int DecBinario(int numeroxx)
    {
        System.out.println("decimal antes de convertir: "+numeroxx);
        int numero, exp, digito,sol;
        double binario;
        String Numero;
        

        do{
            numero = numeroxx;
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);  
                exp++;
                numero = numero/2;
        }
        
        
        return (int)binario;
    }
    public int BinarioDec(int numeroxx)
    {
        String valor = String.valueOf(numeroxx);
        int dec=Integer.parseInt(valor,2);
        //System.out.println(dec);
        return dec;
    }
    public void setNumero1(int valor)
    {
        this.numero1 = BinarioDec(valor);
    }
    public void setNumero2(int valor)
    {
        this.numero2=BinarioDec(valor);
    }
    public int getResultado()
    {
        return DecBinario(this.resultado);
    }
}
