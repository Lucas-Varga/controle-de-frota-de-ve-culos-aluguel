package service;

public class CalculoAluguelCarro implements CalculoAluguel{
    private static double VALOR_DIARIA = 120.00;

    @Override
    public double calcular(int dias) {
        return dias * VALOR_DIARIA;
    }

}
