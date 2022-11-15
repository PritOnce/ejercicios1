public class Cuenta {
    private String titular;
    private double cantidad;

    //Creamos constructor
    public Cuenta(){

    }
    //Constructor objeto
    public Cuenta(Cuenta c){
        this.titular=c.titular;

    }
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        //valor si es negativo o 0
        if (cantidad<0){
            this.cantidad=0;
        }else {
            this.cantidad=cantidad;
        }
    }
}
