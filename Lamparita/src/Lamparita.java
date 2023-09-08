public class Lamparita {

    private boolean estado;

    public void encender() {
        this.estado = true;
        System.out.println("La Lamparita esta encendida");
    }

    public void apagar() {
        this.estado = false;
        System.out.println("La Lamparita esta apagada");
    }

    public boolean estado() {
        return estado;
    }
    public static void main(String[] args) {
        System.out.println("Vamos a programar una lamparita! ");
    }
}
