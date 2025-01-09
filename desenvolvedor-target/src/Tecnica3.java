import java.util.List;
import java.util.ArrayList;

public class Tecnica3 {
    public static void main(String[] args) {
        // Faturamento diário (considerando dias com 0 como não faturamento)
        List<Integer> faturamento = List.of(5000, 6000, 7000, 0, 8000, 6000, 0, 9000, 10000, 11000, 12000, 0, 13000, 14000);
        
        // Filtrando dias com faturamento
        List<Integer> diasComFaturamento = new ArrayList<>();
        for (int valor : faturamento) {
            if (valor > 0) {
                diasComFaturamento.add(valor);
            }
        }
        
        // Calculando o menor e maior faturamento
        int menorFaturamento = Integer.MAX_VALUE;
        int maiorFaturamento = Integer.MIN_VALUE;
        for (int valor : diasComFaturamento) {
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
        }
        
        // Calculando a média de faturamento
        int soma = 0;
        for (int valor : diasComFaturamento) {
            soma += valor;
        }
        double mediaFaturamento = soma / (double) diasComFaturamento.size();
        
        // Contando os dias acima da média
        int diasAcimaMedia = 0;
        for (int valor : diasComFaturamento) {
            if (valor > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }
}