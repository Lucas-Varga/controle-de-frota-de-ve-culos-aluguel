package service;

public class CalculoAluguelMoto implements CalculoAluguel {
    private static double VALOR_DIARIA = 60.00;

    @Override
    public double calcular(int dias) {
        double total = dias * VALOR_DIARIA;
        if (dias > 7) {
            total *= 0.90;
        }
        return total;
    }
}
