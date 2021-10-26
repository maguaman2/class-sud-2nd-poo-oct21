public class Instructor extends Persona{

    private int sueldo;
    public Instructor(String cedula, String nombre, int sueldo){
        super(cedula, nombre);
        this.sueldo=sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
