public class Casillero {
    private int  id;
    private String tamano;

    public Casillero(int id, String tamano) {
        this.id = id;
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
