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
public class CalculoHexadecimal extends Calculo{
    public int HexaDec(String numeroxx)
    {
        
        int dec=Integer.parseInt(numeroxx,16);
        //System.out.println("DEC: "+ dec);
        return dec;
    }
    public String DecHexa(int numeroxx)
    {
        String valor = String.valueOf(numeroxx);
        int dec=numeroxx;
        valor=Integer.toHexString(dec);
        return valor;
    }
    public void setNumero1(String valor)
    {
        this.numero1 = HexaDec(valor);
        System.out.println("numero 1: "+numero1);
    }
    public void setNumero2(String valor)
    {
        this.numero2=HexaDec(valor);
        System.out.println("numero2: "+numero2);
    }
    public String getResultadoo()
    {
        System.out.println("este es el resultado: "+resultado);
        return DecHexa(resultado);
    }
}
