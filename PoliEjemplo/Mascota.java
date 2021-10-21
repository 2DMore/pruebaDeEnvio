package OctNov.PoliEjemplo;

public class Mascota {
    private String nombre;

    public String obtenNombre(){
        return nombre;
    }

    public void asignaNombre(String      nombreMascota){
        nombre= nombreMascota;
    }

    public String habla(){
         return "Soy una pequeña mascota";
    }
}


