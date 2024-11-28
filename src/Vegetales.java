public class Vegetales  extends Plantas{
    private String nutrientes;
    private String fibra;
    private String tipoSabor;

    public Vegetales(String nombre,String color,String tipoClima,double tamanio, String nutrientes, String fibra, String tipoSabor) {
        super(nombre,color,tipoClima,tamanio);
        this.nutrientes = nutrientes;
        this.fibra = fibra;
        this.tipoSabor = tipoSabor;
    }

    public String getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(String nutrientes) {
        this.nutrientes = nutrientes;
    }

    public String getFibra() {
        return fibra;
    }

    public void setFibra(String fibra) {
        this.fibra = fibra;
    }

    public String getTipoSabor() {
        return tipoSabor;
    }

    public void setTipoSabor(String tipoSabor) {
        this.tipoSabor = tipoSabor;
    }

    public void tipoCoxion() {
        System.out.println("Este tipo de vegetal se puede consumir crudo");
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nutrientes: " + nutrientes);
        System.out.println("Fibra: " + fibra);
        System.out.println("Tipo de sabor: " + tipoSabor);
    }

}
