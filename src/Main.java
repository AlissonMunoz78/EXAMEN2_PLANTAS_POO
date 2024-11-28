

public class Main {
    public static void main(String[] args) {

        Plantas planta1 = new Plantas("Arbol", "verde y marron","Variado",1.2);
        Vegetales  vegetales1 = new Vegetales("Limon","Verde","Calido",1.2,"Vitanima C","Hierro","Acido");
        tipoVegetal tipovegetal = new tipoVegetal("Persa","Verde","Calido",2.5,"Vitanima C","Hierro","Acido","Mexico",false,2);

        //Expeciones

        // EL USO DE LAS EXEPCIONES TIENE QUE MODIFICAR LOS DATOS QUEMADOS TANTO EL TAMANIO Y PESO A NUMEROS NEGATIVOS PARA QUE LAS EXCEPCIONES PUEDAN EJECUTARSE

        if(planta1.getTamanio() >= 0){
            System.out.println("--- PLANTAS ---");
            planta1.mostrarDatos();
            planta1.fotoSintesis();
            System.out.println("--- VEGETALES ---");
            vegetales1.mostrarDatos();
            vegetales1.fotoSintesis();
            vegetales1.tipoCoxion();
        }else{
            System.err.println("El tamanio no puede ser negativo");
        }

        if (tipovegetal.getPeso() >= 0){
            System.out.println("--- TIPO VEGETAL ---");
            tipovegetal.mostrarDatos();
            tipovegetal.fotoSintesis();
            tipovegetal.tipoCoxion();
            tipovegetal.consumo();
            System.out.println("-----------------------------------");
        }else{
            System.err.println("El peso no puede ser negativo");
        }
    }
}