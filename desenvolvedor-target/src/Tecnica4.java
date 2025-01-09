import java.util.Map;
import java.util.HashMap;

public class Tecnica4 {
    public static void main(String[] args) {
        // Faturamento por estado
        Map<String, Double> faturamentoEstado = new HashMap<>();
        faturamentoEstado.put("SP", 67836.43);
        faturamentoEstado.put("RJ", 36678.66);
        faturamentoEstado.put("MG", 29229.88);
        faturamentoEstado.put("ES", 27165.48);
        faturamentoEstado.put("Outros", 19849.53);

        // Faturamento total
        double totalFaturamento = 0;
        for (double valor : faturamentoEstado.values()) {
            totalFaturamento += valor;
        }

        // Calculando o percentual de cada estado
        for (Map.Entry<String, Double> entry : faturamentoEstado.entrySet()) {
            String estado = entry.getKey();
            double percentual = (entry.getValue() / totalFaturamento) * 100;
            System.out.println("O estado " + estado + " representa " + String.format("%.2f", percentual) + "% do faturamento total.");
        }
    }
}