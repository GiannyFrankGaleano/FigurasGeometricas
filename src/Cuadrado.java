public class Cuadrado {

    private int lado;


    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int calcularAreaCuadrado() {

        return lado * lado;
    }
    public int calcularPerimetroCuadrado(){

        return 4*lado;
    }

}
