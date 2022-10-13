import javax.swing.*;

public class Menu {

    public void menuOpciones() {

                String mensaje = "por favor escoja una opción\n"
                + "1. cuadrado\n"
                + "2. circulo\n"
                + "3. triangulo\n"
                + "4. paralelogramo\n"
                + "5. salir";




        switch (Util.tomarValorNumerico(mensaje)) {

            case 1:

                menuCuadrado();
                menuOpciones();

                break;
            case 2:
                menuCirculo();
                menuOpciones();
                break;
            case 3:
                menuTriangulo();
                menuOpciones();
                break;
            case 4:
                menuParalelogramo();
                menuOpciones();
                break;
            case 5:

                System.exit(0);
                break;
            default:
                menuOpciones();
        }
    }

    private void menuCuadrado() {


        switch (opcionFigura()) {
            case 1:
                calcularAreaCuadrado();
                break;
            case 2:
                calcularperimetroCuadrado();
                break;
        }
    menuOpciones();
    }

    private void calcularAreaCuadrado() {

        JOptionPane.showMessageDialog(null, "el area del cuadrado es: " + generarCuadrado().calcularAreaCuadrado());
    }

    private void calcularperimetroCuadrado() {


        JOptionPane.showMessageDialog(null, "el resultado del perimetro es: " + generarCuadrado().calcularPerimetroCuadrado());
    }

    private Cuadrado generarCuadrado() {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de un lado"));

        Cuadrado primerCuadrado = new Cuadrado(lado);
        return primerCuadrado;

    }

    private void menuCirculo(){
        switch (opcionFigura()) {
            case 1:
                calcularAreaCirculo();
                break;
            case 2:
            calcularPerimetoCirculo();
                break;
        }

        menuOpciones();
    }

    private void calcularPerimetoCirculo(){
    JOptionPane.showMessageDialog(null,"el perimetro del circulo es: "+generarCirculo().clcularPerimetroCirculo());
    }
    private void calcularAreaCirculo(){

        JOptionPane.showMessageDialog(null,"el area del circulo es: "+generarCirculo().calcularAreaCirculo());
    }

    private Circulo generarCirculo(){
        double radio = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese el radio"));
    Circulo primerCirculo = new Circulo(radio);
    return primerCirculo;
    }


    public void menuTriangulo(){

        switch (opcionFigura()){
            case 1:
                calcularAreaTriangulo();
                break;
            case 2:
                calcularPerimetroTriangulo();
                break;
        }
        menuOpciones();
    }

    private Triangulo generarTriangulo(){
        double base = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la base"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura"));

        double ladoUno = Double.parseDouble(JOptionPane.showInputDialog("dijite el valor del lado 1"));

        double ladoDos = Double.parseDouble(JOptionPane.showInputDialog("dijite el valor del lado 2"));

        Triangulo primerTriangulo = new Triangulo(base,altura,ladoUno,ladoDos);
        return primerTriangulo;
    }

    private void calcularAreaTriangulo(){

        JOptionPane.showMessageDialog(null,"el valor del area es: "+generarTriangulo().calcularAreaTriangulo());
    }

    private void calcularPerimetroTriangulo(){

        JOptionPane.showMessageDialog(null,"el valor del perimetro es: "+generarTriangulo().calcularPerimetroTriangulo());
    }

    public void menuParalelogramo(){

        switch (opcionFigura()){
            case 1:

                calcularAreaParalelogramo();
                break;
            case 2:

                calcularPerimetroParalelogramo();
                break;


        }
        menuOpciones();
    }

    private Paralelogramo generarParalelogramo(){
        int base = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura"));

        int lado = Integer.parseInt(JOptionPane.showInputDialog("dijite el valor del lado "));

        Paralelogramo primerParalelogramo = new Paralelogramo(base,altura,lado);
        return primerParalelogramo;
    }

    private void calcularAreaParalelogramo(){

        JOptionPane.showMessageDialog(null,"el valor del area es: "+generarParalelogramo().calcularAreaParalelogramo());
    }

    private void calcularPerimetroParalelogramo(){

        JOptionPane.showMessageDialog(null,"el valor del area es: "+generarParalelogramo().calcularPerimetroParalelogramo());
    }
private int opcionFigura(){

    String mensaje = "por favor escoja una opción\n"
            + "1. calcular area\n"
            + "2. calcular perimetro\n";


    return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
}


}
