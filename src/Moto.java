public class Moto extends Veiculo{
    int cilindrada;

    public Moto(String modelo, String placa, int cilindrada, double valorPorDia) {
        super(modelo, placa, valorPorDia);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);

        if (dias > 7) {
            return valorBase * 0.95;
        }
        return valorBase;
    }
}
