import java.util.Scanner;

public class ConversorDeUnidades {

    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    public static double metrosParaMilimetros(double metros) {
        return metros * 1000;
    }

    public static double metrosParaKilometros(double metros) {
        return metros / 1000;
    }

    public static double metrosParaPes(double metros) {
        return metros * 3.28084;
    }

    public static double metrosParaJardas(double metros) {
        return metros * 1.09361;
    }

    public static double metrosParaMilhas(double metros) {
        return metros / 1609.344;
    }

    public static void exibirConversoes(double metros) {
        System.out.println("\nConversões para " + metros + " metros:");
        System.out.println("Centímetros: " + metrosParaCentimetros(metros) + " cm");
        System.out.println("Milímetros: " + metrosParaMilimetros(metros) + " mm");
        System.out.println("Quilômetros: " + metrosParaKilometros(metros) + " km");
        System.out.println("Pés: " + metrosParaPes(metros) + " ft");
        System.out.println("Jardas: " + metrosParaJardas(metros) + " yd");
        System.out.println("Milhas: " + metrosParaMilhas(metros) + " mi");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        double metros = scanner.nextDouble();

        exibirConversoes(metros);
    }
}
