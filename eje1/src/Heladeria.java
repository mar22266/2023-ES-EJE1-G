public class Heladeria {

    public helado HeladoVainilla(){
        return new heladoVainilla(5, "Vainilla");
    }

    public helado HeladoChocolate(){
        return new heladoChocolate(5, "Chocolate");
    }

    public helado HeladoFresa(){
        return new heladoFresa(5, "Fresa");
    }

    public helado HeladoMango(){
        return new heladoMango(5, "Mango");
    }

    public helado HeladoNuez(){
        return new heladoNuez(5, "Nuez");
    }
}
