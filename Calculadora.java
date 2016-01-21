
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    //
    private int numero;
    
    public Calculadora()
    {
        numero = 0;
    }
    
    public void multiplesOfFive()
    {
        numero = 10;
        
        while (numero % 5 == 0 && numero < 95){
            numero = numero + 5;
            System.out.println(numero);
        }
    }
    
}
