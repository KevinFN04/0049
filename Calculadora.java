
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{

    /**
     * Metodo que calcula los multiplos de 5 entre 10 y 95 (ambos no incluidos).
     */
    public void multiplesOfFive()
    {
        int numero = 10;

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
        int numero = 0;

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
        int numero = 0;

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

    /**
     * 
     */
    public boolean isPrime(int n)
    {
        boolean esPrimo = false;       
        int numero = n - 1;
        float resultado = 0;
        while (n % numero != 0 && esPrimo != true && n > 0){
            if (numero > 2){
                resultado = n / numero;
                numero = numero - 1;
            }
            else if (n == 2){
                esPrimo = true;
            }
            else{
                esPrimo = true;
            }
        }
        
        return esPrimo;
    }
}

