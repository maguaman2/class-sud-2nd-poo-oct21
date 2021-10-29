public class Factura {
    public String id;
    private String fecha;
    private String formaPago;

    public Factura(String id, String fecha, String formaPago) {
        this.id = id;
        this.fecha = fecha;
        this.formaPago = formaPago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}
