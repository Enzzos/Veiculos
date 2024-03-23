import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String placa, String chassi, int anoFabricacao, int qtdPassageiros, int cilindradas) {
        super(marca, modelo, ano, placa, chassi, anoFabricacao, qtdPassageiros);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println("Empinando a moto...");
    }

    public static Moto cadastrarMoto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Moto");
        System.out.println("----------------");

        System.out.println("Informe a marca da moto:");
        String marca = scanner.nextLine();

        System.out.println("Informe o modelo da moto:");
        String modelo = scanner.nextLine();

        System.out.println("Informe o ano da moto:");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.println("Informe a placa da moto:");
        String placa = scanner.nextLine();

        System.out.println("Informe o chassi da moto:");
        String chassi = scanner.nextLine();

        System.out.println("Informe o ano de fabricação da moto:");
        int anoFabricacao = scanner.nextInt();

        System.out.println("Informe a quantidade de passageiros da moto:");
        int qtdPassageiros = scanner.nextInt();

        System.out.println("Informe as cilindradas da moto:");
        int cilindradas = scanner.nextInt();

        Moto moto = new Moto(marca, modelo, ano, placa, chassi, anoFabricacao, qtdPassageiros, cilindradas);

        System.out.println("Moto cadastrada com sucesso!");
        moto.mostrarInformacoes();

        scanner.close();

        return moto;
    }
}
