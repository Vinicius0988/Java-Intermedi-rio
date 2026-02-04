public class App {
    public static void main(String[] args) throws Exception {
        

        double y = 10;
        double x = 30;

        for (Operacoes op : Operacoes.values()) {
            double resultado = op.executarOperacao(x, y);
            System.out.println(resultado);
        }

        










    }
}
