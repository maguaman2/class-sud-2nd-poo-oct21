public class Main {
    public static void main(String[] args) {
        System.out.println("Relaciones en Java");
        Cliente invitado = new Cliente("030017070","Marco",28);
        Casillero casillero = new Casillero(1,"small");
        invitado.setCasillero(casillero);

        System.out.println((invitado.getCasillero()).getTamano());
        System.out.println((invitado.getMedidas()).getPeso());


        Cliente laroca = new Cliente("0102","la roca", 35);
        Cliente bigShow = new Cliente("0103","Big Show", 34);
        Cliente[] lista = new Cliente[2];
        lista[0]=laroca;
        lista[1]=bigShow;


        GrupoCompetencia grupoUno = new GrupoCompetencia("Elite");
        grupoUno.setListaClienteds(lista);
        grupoUno.mostrarNomnbre();
    }


}
