import model.Carro;
import model.Moto;
import model.Veiculo;
import service.CalculoAluguel;
import service.CalculoAluguelCarro;

void main() {
    Scanner sc = new Scanner(System.in);

    int quantCarros = 0;
    int quantMotos = 0;
    double valorTotal = 0;

    List<Veiculo> listaDeVeiculos = new ArrayList<>();

    System.out.println("=== BEM-VINDO A LOCADORA NUMERO 1 DO BRASIL ===");
    System.out.println("\nQuantos veículos serão alugados?");
    int quantVeiculos = sc.nextInt();

    System.out.println("Desses " + quantVeiculos +" Veículos, quantos serão carros?");
    quantCarros = sc.nextInt();
    if (quantCarros > 0) {
        for (int i = 0; i < quantCarros; i++) {
            System.out.println("Digite o modelo do Carro " + i + 1 + ":");
            String modelo = sc.next();
            System.out.println("Digite a placa do Carro: " + modelo);
            String placa = sc.next();
            System.out.println("Digite quantos dias deseja alugar: ");
            int diarias = sc.nextInt();

            Veiculo carro = new Carro(modelo, placa);
            listaDeVeiculos.add(carro);

            double valorAluguel = carro.calcularAluguel(diarias);
            valorTotal += valorAluguel;

            System.out.printf("Valor do aluguel do %s por %d dias: R$ %.2f%n", modelo, diarias, valorAluguel);
        }
    }
    quantMotos = quantVeiculos - quantCarros;
    if (quantCarros < quantVeiculos) {
        for (int i = 0; i < quantMotos; i++) {
            System.out.println("Digite o modelo da Moto: ");
            String modelo = sc.next();
            System.out.println("Digite a placa da Moto: " + modelo);
            String placa = sc.next();
            System.out.println("Digite a cilindrada da moto: ");
            int cilindrada = sc.nextInt();
            System.out.println("Digite quantos dias deseja alugar a moto " + modelo);
            int diarias = sc.nextInt();

            Veiculo moto = new Moto(modelo, placa, cilindrada);
            listaDeVeiculos.add(moto);

            double valorAluguel = moto.calcularAluguel(diarias);
            valorTotal += valorAluguel;

            System.out.printf("Valor do aluguel do %s por %d dias: R$ %.2f%n", modelo, diarias, valorAluguel);
        }
    }

    System.out.println("\n=== LISTA DE VEÍCULOS CADASTRADOS ===");
    for (Veiculo v : listaDeVeiculos) {
        v.exibirDetalhes();
    }

    System.out.printf("%nVALOR TOTAL DE ALUGUEL: R$ %.2f%n", valorTotal);

}
