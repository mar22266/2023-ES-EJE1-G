public class Helados extends Heladeria{
    private int tamanio;
    private String saborHelado;

    public Helados(int tamanio,String saborHelado) {
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
