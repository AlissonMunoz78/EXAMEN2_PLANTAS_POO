public class Plantas {
    private String color;
    private String tipoClima;
    private double tamanio;

    public Plantas(String color,String tipoClima, double tamanio){
        this.color = color;
        this.tipoClima = tipoClima;
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }



    public void fotoSintesis() {
        System.out.println("La planta sintetiza sus propios nutrientes.");
    }

    public void mostrarDatos() {
        System.out.println("El color es: " + color);
        System.out.println("El tipo de clima es: " + tipoClima);
        System.out.println("El tamaño es: " + tamanio + " metros");
    }

}
