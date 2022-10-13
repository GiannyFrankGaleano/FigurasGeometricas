public class Paralelogramo {
    private int base;
    private int altura;
    private int lado;

    public Paralelogramo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    public int calcularAreaParalelogramo(){
        return base * altura;
    }
    public int calcularPerimetroParalelogramo(){
        return 2*(altura+base);
    }
}
