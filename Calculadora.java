
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    //Atributo que guarda los numeros de la calculadora
    private int numero;
    
    /**
     * Constructor de Calculadora que inicializa sus parametros.
     */
    public Calculadora()
    {
        numero = 0;
    }
    
    /**
     * Metodo que calcula los multiplos de 5 entre 10 y 95 (ambos no incluidos).
     */
    public void multiplesOfFive()
    {
        numero = 10;
        
        while (numero % 5 == 0 && numero < 95){
            numero = numero + 5;
            System.out.println(numero);
        }
    }
    
    /**
     * Metodo que imprime por pantalla la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos).
     */
    public void sumValues()
    {
        int indice = 0;
        numero = 0;
        
        while (indice < 11)
        {
            numero = numero + indice;
            indice++;
        }
        
        System.out.println(numero);
    }
    
     /**
     * Metodo que imprime por pantalla la suma de dos numeros dados por parametro (ambos incluidos).
     */
    public int sumValuesInterval(int a, int b)
    {
        int indice = a;
        numero = 0;
        
        if (b < a){
            a = b;
            b = indice;
            indice = a;
        }
        
        while (indice >= a && indice <= b)
        {
            numero = numero + indice;
            indice++;
        }
        
        if (a == b){
            numero = a;
        }
        else if (a < 0 || b < 0){
            numero = -1;
        }
        
        return numero;
    }
    
    
}
