
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
     * Metodo que indica si el numero introducido es primo o no.
     */
    public boolean isPrime(int n)
    {
        boolean esPrimo = false;       
        int numero = n - 1;
        if (n !=1){
            while (n % numero != 0 && esPrimo != true){
                if (numero > 2){
                    numero = numero - 1;
                }
                else{
                    esPrimo = true;
                }
            }
        }
        if (n == 2){
            esPrimo = true;
        }
        if (n == 1){
            System.out.println("ERROR!");
        }
        return esPrimo;
    }

    /**
     * Metodo para multiplicar dos numeros(utilizando unicamente sumas y restas).
     */
    public int multiplicar(int a, int b){
        int contador = 0;
        int numero = 0;
        if (a >= 0 && b >= 0){
            while (contador != b){
                numero = numero + a;
                contador++;
            }
        }
        else{
            numero = -1;
            System.out.println("ERROR!");
        }
        return numero;
    }
}

