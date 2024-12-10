import java.util.Scanner;

public class ConversorDeUnidades {

    private double metros;

    public ConversorDeUnidades(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double metrosParaCentimetros() {
        return metros * 100;
    }

    public double metrosParaMilimetros() {
        return metros * 1000;
    }

    public double metrosParaKilometros() {
        return metros / 1000;
    }

    public double metrosParaPes() {
        return metros * 3.28084;
    }

    public double metrosParaJardas() {
        return metros * 1.09361;
    }

    public double metrosParaMilhas() {
        return metros / 1609.344;
    }

    public void exibirConversoes() {
        System.out.println("\nConversões para " + metros + " metros:");
        System.out.println("Centímetros: " + metrosParaCentimetros() + " cm");
        System.out.println("Milímetros: " + metrosParaMilimetros() + " mm");
        System.out.println("Quilômetros: " + metrosParaKilometros() + " km");
        System.out.println("Pés: " + metrosParaPes() + " ft");
        System.out.println("Jardas: " + metrosParaJardas() + " yd");
        System.out.println("Milhas: " + metrosParaMilhas() + " mi");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        double metros = scanner.nextDouble();

        ConversorDeUnidades conversor = new ConversorDeUnidades(metros);

        conversor.exibirConversoes();

        scanner.close();
    }
}