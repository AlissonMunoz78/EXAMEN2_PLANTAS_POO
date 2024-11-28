public class tipoVegetal extends Vegetales {
    private String ubicacion; // donde se cultiva
    private boolean Semilla; //Si tiene semilla o no
    private double peso;


    public tipoVegetal(String nombre,String color,String tipoClima,double tamanio,String nutrientes,String fibra,String tipoSabor,String ubicacion, boolean Semilla, double peso){
        super(nombre,color,tipoClima,tamanio,nutrientes,fibra,tipoSabor);
        this.ubicacion = ubicacion;
        this.Semilla = Semilla;
        this.peso = peso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isSemilla() {
        return Semilla;
    }

    public void setSemilla(boolean semilla) {
        Semilla = semilla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void consumo(){
        System.out.println("Es consumible para algo dulce o salado");

    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Tiene semilla: " + Semilla);
        System.out.println("Peso: " + peso + " kg");
    }
}
