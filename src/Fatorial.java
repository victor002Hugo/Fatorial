public class Fatorial {
    //Versao iterativa do cálculo do fatorial
    public int calcularFatorialIterativo(int n) throws
            IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("nao existe fatorial para numeros negativo");
        int resultado = 1;
        if (n !=0) {
            for (int i = 2; i <=n; i++)
                resultado *= i;
        }
        return resultado;
    }
}

