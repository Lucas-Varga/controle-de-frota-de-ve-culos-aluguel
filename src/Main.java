void main() {
    Scanner sc = new Scanner(System.in);

    int quantCarros = 0;
    int quantMotos = 0;
    double valorPorDia = 0;
    int diariasCarro = 0;
    int diariasMoto = 0;
    double valorAluguelCarro = 0;
    double valorAluguelMoto = 0;

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
            System.out.println("Digite quantos dias deseja alugar: ");
            diariasCarro = sc.nextInt();
            System.out.println("Digite o valor da diária que deseja pagar: ");
            valorPorDia = sc.nextDouble();
            System.out.println("Digite a placa do Carro: ");
            String placa = sc.next();
            System.out.println("Digite a quantidade de portas do carro: ");
            int quantidadeDePortas = sc.nextInt();

            Veiculo carro = new Carro(modelo, placa, quantidadeDePortas, valorPorDia);
            listaDeVeiculos.add(carro);
            valorAluguelCarro = carro.calcularAluguel(diariasCarro);
        }
    }
    quantMotos = quantVeiculos - quantCarros;
    if (quantCarros < quantVeiculos) {
        for (int i = 0; i < quantMotos; i++) {
            System.out.println("Digite o modelo da Moto: ");
            String modelo = sc.next();
            System.out.println("Digite quantos dias deseja alugar a moto " + modelo);
            diariasMoto = sc.nextInt();
            System.out.println("Digite a placa da Moto: ");
            String placa = sc.next();
            System.out.println("Digite a cilindrada da moto: ");
            int cilindrada = sc.nextInt();
            System.out.println("Digite o valor da diária: ");
            valorPorDia = sc.nextDouble();
            Veiculo moto = new Moto(modelo, placa, cilindrada, valorPorDia);
            listaDeVeiculos.add(moto);
            valorAluguelMoto = moto.calcularAluguel(diariasMoto);
        }
    }

    System.out.println("\n=== LISTA DE VEÍCULOS CADASTRADOS ===");
    for (Veiculo v : listaDeVeiculos) {
        v.exibirDetalhes();
    }
    double valorTotal = valorAluguelCarro + valorAluguelMoto;
    System.out.println("VALOR TOTAL DE ALUGUEL: " + valorTotal);

}
