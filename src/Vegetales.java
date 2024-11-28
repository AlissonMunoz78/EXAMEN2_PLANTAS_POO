public class Vegetales {
    private String nutrientes;
    private String fibra;
    private String tipoSabor;

    public Vegetales(String nutrientes, String fibra, String tipoSabor) {
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
}
