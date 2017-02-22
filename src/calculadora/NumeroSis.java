
package calculadora;

/**
 *
 * @author khond
 */
public class NumeroSis{
/**
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
    
    public int BinarioDec(int numeroxx)
    {
        String valor = String.valueOf(numeroxx);
        int dec=Integer.parseInt(valor,2);
        //System.out.println(dec);
        return dec;
    }
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
    *
    * *
    * /
    */
    
}
    
    
    

