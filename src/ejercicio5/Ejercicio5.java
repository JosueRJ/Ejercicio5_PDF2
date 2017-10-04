package ejercicio5;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo c1 = new Complejo(2.5, 3.7);
        Complejo c2 = new Complejo(5.2, 6.6);
        Complejo c3;
        
        // operadores para los numeros complejos

        System.out.println("SUMA DE NUMEROS COMPLEJOS");
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        System.out.println("------------------------------");
        System.out.println("RESTA DE NUMEROS COMPLEJOS");
        c3 = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        System.out.println("------------------------------");
        System.out.println("MULTIPLICACION DE NUMEROS COMPLEJOS");
        c3 = c1.multiplicar(3.5);
        System.out.println(c1 + " * 3.5 = " + c3);
        System.out.println("------------------------------");
        System.out.println("DIVISION DE NUMEROS COMPLEJOS");
        c3 = c1.dividir(c2);
        System.out.println(c1 + " / " + c2 + " = " + c3);
        
        
        
    }
    
}
