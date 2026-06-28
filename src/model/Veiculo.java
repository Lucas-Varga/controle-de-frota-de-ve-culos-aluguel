package model;

import service.CalculoAluguel;

public abstract class Veiculo {

    private String modelo;
    private String placa;

    private CalculoAluguel calculoAluguel;

    public Veiculo(String modelo, String placa, CalculoAluguel calculoAluguel) {
        this.modelo = modelo;
        this.placa = placa;
        this.calculoAluguel = calculoAluguel;
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

    public void setCalculoAluguel(CalculoAluguel calculoAluguel) {
        this.calculoAluguel = calculoAluguel;
    }

    public CalculoAluguel getCalculoAluguel() {
        return calculoAluguel;
    }

    public double calcularAluguel(int dias) {
      return calculoAluguel.calcular(dias);
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + this.modelo + " - " + " Placa: " + this.placa);
    }

}
