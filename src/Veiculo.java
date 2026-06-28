public abstract class Veiculo {

    private String modelo;
    private String placa;
    private double valorPorDia;

    public Veiculo(String modelo, String placa, double valorPorDia) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorPorDia = valorPorDia;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public double calcularAluguel(int dias) {
       double valor = this.valorPorDia * dias;
       System.out.println("Valor total do aluguel: " + valor);
       return valor;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.modelo + " - " + " Placa: " + this.placa);
    }


}
