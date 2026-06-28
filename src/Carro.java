public class Carro extends Veiculo{

    int quantidadeDePortas;

    public Carro(String modelo, String placa, int quantidadeDePortas, double valorPorDia) {
        super(modelo, placa, valorPorDia);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        return super.calcularAluguel(dias);
    }
}
