public class Circulo {

    private double radio;
    private final  double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCirculo(){

        return PI * (radio*radio);

    }
    public double clcularPerimetroCirculo(){
        return (2* PI)*radio;

    }
}
