import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Heladeria heladeria = new Heladeria();
        Helados helados = new Helados("Grande", "Vainilla");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la heladeria");
        System.out.println("Ingrese el sabor de helado que desea: ");
        String sabor = scanner.nextLine();

        if (sabor.equals("Vainilla")){
            System.out.println(heladeria.HeladoVainilla());
        }else if (sabor.equals("Chocolate")){
            System.out.println(heladeria.HeladoChocolate());
        }else if (sabor.equals("Fresa")){
            System.out.println(heladeria.HeladoFresa());
        }else if (sabor.equals("Mango")){
            System.out.println(heladeria.HeladoMango());
        }else if (sabor.equals("Nuez")){
            System.out.println(heladeria.HeladoNuez());
        }else{
            System.out.println("No tenemos ese sabor de helado");
        }

    }
}