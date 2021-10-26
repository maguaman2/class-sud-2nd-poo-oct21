public class GrupoCompetencia {
    private String descripcion;
    private Cliente[] listaClienteds;

    public GrupoCompetencia(String descripcion ) {
        this.descripcion = descripcion;
        this.listaClienteds = listaClienteds;
        listaClienteds= new Cliente[5];
    }

    public Cliente[] getListaClienteds() {
        return listaClienteds;
    }

    public void setListaClienteds(Cliente[] listaClienteds) {
        this.listaClienteds = listaClienteds;
    }

    public void mostrarNomnbre() {

        System.out.println("los competidores de esta lista son: ");

        for (Cliente c:listaClienteds) {

            System.out.println("- "+ c.getNombre());
        }

        }




}
