public class Helados extends Heladeria{
    private String tamanio;
    private String saborHelado;

    public Helados(String tamanio,String saborHelado) {
        this.tamanio = tamanio;
        this.saborHelado = saborHelado;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Helados{" +
                "Tamaño de Heladao=" + tamanio +
                ",Sabor de Helado='" + saborHelado + '\'' +
                '}';
    }


}
