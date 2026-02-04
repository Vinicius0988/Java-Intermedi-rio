import java.util.Random;

public class GeradorCpf {

    private static final Random random = new Random();

    // ==================== CPF ====================
    public static String gerarCPF() {
        int[] cpf = new int[11];

        // Gera os 9 primeiros dígitos
        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }

        // Primeiro dígito verificador
        cpf[9] = calcularDigitoCPF(cpf, 9);

        // Segundo dígito verificador
        cpf[10] = calcularDigitoCPF(cpf, 10);

        return formatarCPF(cpf);
    }

    private static int calcularDigitoCPF(int[] cpf, int pesoInicial) {
        int soma = 0;
        int peso = pesoInicial + 1;

        for (int i = 0; i < pesoInicial; i++) {
            soma += cpf[i] * (peso - i);
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }

    private static String formatarCPF(int[] cpf) {
        return String.format("%d%d%d.%d%d%d.%d%d%d-%d%d",
                cpf[0], cpf[1], cpf[2],
                cpf[3], cpf[4], cpf[5],
                cpf[6], cpf[7], cpf[8],
                cpf[9], cpf[10]);
    }

    // ==================== CNPJ ====================
    public static String gerarCNPJ() {
        int[] cnpj = new int[14];

        // Gera os 12 primeiros dígitos
        for (int i = 0; i < 12; i++) {
            cnpj[i] = random.nextInt(10);
        }

        // Primeiro dígito verificador
        cnpj[12] = calcularDigitoCNPJ(cnpj, 12);

        // Segundo dígito verificador
        cnpj[13] = calcularDigitoCNPJ(cnpj, 13);

        return formatarCNPJ(cnpj);
    }

    private static int calcularDigitoCNPJ(int[] cnpj, int tamanho) {
        int[] pesos = (tamanho == 12)
                ? new int[]{5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2}
                : new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += cnpj[i] * pesos[i];
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }

    private static String formatarCNPJ(int[] cnpj) {
        return String.format("%d%d.%d%d%d.%d%d%d/%d%d%d%d-%d%d",
                cnpj[0], cnpj[1],
                cnpj[2], cnpj[3], cnpj[4],
                cnpj[5], cnpj[6], cnpj[7],
                cnpj[8], cnpj[9], cnpj[10], cnpj[11],
                cnpj[12], cnpj[13]);
    }
}
