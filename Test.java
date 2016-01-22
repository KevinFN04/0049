
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    
    public void testSumValuesInterval()
    {
        Calculadora calculadora1 = new Calculadora();
        
        boolean esCorrecto = true;
        int a = calculadora1.sumValuesInterval(0, 10);
        int b = calculadora1.sumValuesInterval(20, 10);
        int c = calculadora1.sumValuesInterval(5, 25);
        int d = calculadora1.sumValuesInterval(20, 100);
        int e = calculadora1.sumValuesInterval(-1, 10);
        int f = calculadora1.sumValuesInterval(20, -5);
        
        if (a != 55){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        if (b != 165){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        if (c != 315){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        if (d != 4860){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        if (e != -1){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        if (f != -1){
            esCorrecto = false;
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(0, 10)... resultado correcto 55 / resultado metodo " + a + "... OK!");
        }
        
        if (esCorrecto == false){
            System.out.println("El metodo NO funciona correctamente.");
        }
        else{
            System.out.println("El metodo SI funciona correctamente.");
        }
    }
    
    public void testIsPrime()
    {
        Calculadora calculadora1 = new Calculadora();
        
        boolean esCorrecto = true;
        boolean a = calculadora1.isPrime(7);
        boolean b = calculadora1.isPrime(13);
        boolean c = calculadora1.isPrime(10);
        boolean d = calculadora1.isPrime(8);
        boolean e = calculadora1.isPrime(-3);
        boolean f = calculadora1.isPrime(62);
        
        if (a != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + a + "... OK!");
        }
        if (b != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + a + "... OK!");
        }
        if (c != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + a + "... OK!");
        }
        if (d != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(8)... resultado correcto false / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(8)... resultado correcto false / resultado metodo " + a + "... OK!");
        }
        if (e != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(-3)... resultado correcto false / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(-3)... resultado correcto false / resultado metodo " + a + "... OK!");
        }
        if (f != true){
            esCorrecto = false;
            System.out.println("Comprobando isPrime(62)... resultado correcto false / resultado metodo " + a + "... ERROR!");
        }
        else{
            System.out.println("Comprobando isPrime(62)... resultado correcto false / resultado metodo " + a + "... OK!");
        }
        
        if (esCorrecto == false){
            System.out.println("El metodo NO funciona correctamente.");
        }
        else{
            System.out.println("El metodo SI funciona correctamente.");
        }
    }
}
