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
public class CalculoOctal extends Calculo{
    
    public int OctalDec(int numeroxx)
    {           
                Integer outputDecimal=0;
		String inputHex = String.valueOf(numeroxx);
		try{
			// actual conversion of octal to decimal
			outputDecimal = Integer.parseInt(inputHex, 8);
			//System.out.println("Decimal Equivalent : "+outputDecimal);
		}
		catch(NumberFormatException ne){
			// Printing a warning message if the input is not a valid octal number
			System.out.println("Invalid Input, Numero de 0-7");
		}
		return outputDecimal;
	
    }
    public int DecOctal(int numeroxx)
    {
        int rem;
        int num=numeroxx;
    
        String str=""; 
 
    
        char dig[]={'0','1','2','3','4','5','6','7'};
 
        while(num>0)
        {
            rem=num%8; 
            str=dig[rem]+str; 
            num=num/8;
        }
        return Integer.parseInt(str);
    }
    public void setNumero1(int valor)
    {
        this.numero1 = OctalDec(valor);
    }
    public void setNumero2(int valor)
    {
        this.numero2=OctalDec(valor);
    }
    public int getResultado()
    {
        return DecOctal(this.resultado);
    }
}
