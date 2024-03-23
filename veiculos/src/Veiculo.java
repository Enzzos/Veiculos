import java.util.Scanner;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String placa;
    protected String chassi;
    protected int anoFabricacao;
    protected int qtdPassageiros;

    public Veiculo(String marca, String modelo, int ano, String placa, String chassi, int anoFabricacao, int qtdPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
        this.qtdPassageiros = qtdPassageiros;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando...");
    }

    public void frear() {
        System.out.println("Veículo freando...");
    }

    public void mostrarInformacoes() {
        System.out.println("\nInformações do Veículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quantidade de Passageiros: " + qtdPassageiros);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Veículo");
        System.out.println("-------------------");

        System.out.println("Escolha o tipo de veículo a cadastrar (carro/moto):");
        String tipoVeiculo = scanner.nextLine();

        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            Carro carro = Carro.cadastrarCarro();
            System.out.println("Carro cadastrado com sucesso!");
            carro.mostrarInformacoes();
        } else if (tipoVeiculo.equalsIgnoreCase("moto")) {
            Moto moto = Moto.cadastrarMoto();
            System.out.println("Moto cadastrada com sucesso!");
            moto.mostrarInformacoes();
        } else {
            System.out.println("Tipo de veículo inválido!");
        }

        scanner.close();
    }
}
