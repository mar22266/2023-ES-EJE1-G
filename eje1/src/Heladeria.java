public class Heladeria {

    public Helados HeladoVainilla(){
        return new Helados("Grande", "Vainilla");
    }

    public Helados HeladoChocolate(){
        return new Helados("Grande", "Chocolate");
    }

    public Helados HeladoFresa(){
        return new Helados("Peque", "Fresa");
    }

    public Helados HeladoMango(){
        return new Helados("Mediano", "Mango");
    }

    public Helados HeladoNuez(){
        return new Helados("Extra grande", "Nuez");
    }
}
