
package ejercicio5;

public class Complejo {
    //atributos
    private double Real;
    private double Imaginario;
    
    //Constructores
    //Por defecto
    public Complejo() {}
    
    //Con parametros
    public Complejo(double Real, double Imaginario) {
        this.Real = Real;
        this.Imaginario = Imaginario;
    }
    
    //Set and get

    public double getReal() {
        return Real;
    }

    public void setReal(double Real) {
        this.Real = Real;
    }

    public double getImaginario() {
        return Imaginario;
    }

    public void setImaginario(double Imaginario) {
        this.Imaginario = Imaginario;
    }
    
    //Metodos
    public Complejo sumar(Complejo c){
        Complejo co = new Complejo();
        co.Real = Real + c.Real;
        co.Imaginario = Imaginario + c.Imaginario;
        return co;
    }
   
    public Complejo restar(Complejo c){
        Complejo co = new Complejo();
        co.Real = Real - c.Real;
        co.Imaginario = Imaginario - c.Imaginario;
        return co;
    }
   
    public Complejo multiplicar(double n){
        Complejo co = new Complejo();
        co.Real = Real * n;
        co.Imaginario = Imaginario * n;
        return co;
    }
   
    public Complejo dividir(Complejo c){
        Complejo co = new Complejo();
        co.Real = (Real * c.Real + Imaginario * c.Imaginario)/(c.Real * c.Real + c.Imaginario * c.Imaginario);
        co.Imaginario = (Imaginario * c.Real - Real * c.Imaginario)/(c.Real * c.Real + c.Imaginario * c.Imaginario);
        return co;
    }

    //método toString para sobreescribir
    @Override
    public String toString() {
        return "(" + Real + ", " + Imaginario + ")";
    }
}
