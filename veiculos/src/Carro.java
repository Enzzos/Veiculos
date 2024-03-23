import java.util.Scanner;

public class Carro extends Veiculo {
    private int nroPortas;

    public Carro(String marca, String modelo, int ano, String placa, String chassi, int anoFabricacao, int qtdPassageiros, int nroPortas) {
        super(marca, modelo, ano, placa, chassi, anoFabricacao, qtdPassageiros);
        this.nroPortas = nroPortas;
    }

    public void abrirPorta() {
        System.out.println("Abrindo uma porta do carro...");
    }

    public static Carro cadastrarCarro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Carro");
        System.out.println("-----------------");

        System.out.println("Informe a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Informe o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Informe o ano do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.println("Informe a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("Informe o chassi do carro:");
        String chassi = scanner.nextLine();

        System.out.println("Informe o ano de fabricação do carro:");
        int anoFabricacao = scanner.nextInt();

        System.out.println("Informe a quantidade de passageiros do carro:");
        int qtdPassageiros = scanner.nextInt();

        System.out.println("Informe o número de portas do carro:");
        int nroPortas = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano, placa, chassi, anoFabricacao, qtdPassageiros, nroPortas);

        System.out.println("Carro cadastrado com sucesso!");
        carro.mostrarInformacoes();

        scanner.close();

        return carro;
    }
}
