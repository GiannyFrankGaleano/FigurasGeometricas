public class Triangulo {
    //area (base*altura)/2
    // perimetro: base+ lado1 + lado2

    private double base;
    private double altura;
    private double ladoUno;
    private double ladoDos;

    public Triangulo(double base, double altura, double ladoUno, double ladoDos) {
        this.base = base;
        this.altura = altura;
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public double calcularAreaTriangulo(){
        return (base*altura)/2;
    }

    public double calcularPerimetroTriangulo(){

        return base+ladoUno+ladoDos;
    }
}
