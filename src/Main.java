void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos veículos serão alugados?");
    int quantCarros = sc.nextInt();
    List<Veiculo> listaDeVeiculos = new ArrayList<>();

    for (int i = 0; i < quantCarros; i++) {
        System.out.println("Digite 1 para Carro\nDigite 2 para Moto");
        double tipo = sc.nextInt();
        System.out.println("Digite a marca do Veículo: ");
        String modelo = sc.next();
        System.out.println("Digite a placa do Veículo: ");
        String placa = sc.next();
        if (tipo == 1) {
            System.out.println("Digite a quantidade de portas do carro: ");
            int quantidadeDePortas = sc.nextInt();
            System.out.println("Digite o valor da diária: ");
            double valorPorDia = sc.nextDouble();
            if (tipo == 1) {
                Veiculo carro = new Carro(modelo, placa, quantidadeDePortas, valorPorDia);
                listaDeVeiculos.add(carro);
            }
        }
        else if (tipo == 2) {
            System.out.println("Digite a cilindrada da moto: ");
            int cilindrada = sc.nextInt();
            System.out.println("Digite o valor da diária: ");
            double valorPorDia = sc.nextDouble();
            Veiculo moto = new Moto(modelo, placa, cilindrada, valorPorDia);
            listaDeVeiculos.add(moto);
        } else {
            System.out.println("Voce digitou um valor errado!\nENCERRANDO!");
        }

    }
    System.out.println("\n=== LISTA DE VEÍCULOS CADASTRADOS ===");
    for (Veiculo v : listaDeVeiculos) {
        v.exibirDetalhes();
    }


}
