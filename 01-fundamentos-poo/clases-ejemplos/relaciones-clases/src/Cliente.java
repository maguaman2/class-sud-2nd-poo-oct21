public class Cliente extends Persona{
    private int edad;
    private Casillero casillero;
    private Medidas medidas;

    public Cliente(String cedula, String nombre, int edad) {
        super(cedula, nombre);
        this.edad=edad;
        this.medidas= new Medidas(1,2);
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String obtenerNumeroCasillero(){
        return casillero.getTamano();
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }
}
