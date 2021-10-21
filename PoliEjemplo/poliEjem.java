package OctNov.PoliEjemplo;
public class poliEjem {

    public static void main(String[] args) {

        Mascota p;
        p= new Perro();
        System.out.println(p.habla());

        p= new Gato();
        System.out.println(p.habla());

        p= new Vaca();
        System.out.println(p.habla());
    }
}
