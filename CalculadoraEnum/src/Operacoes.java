

public enum Operacoes {

    SOMAR("+"){
        @Override
        public double executarOperacao(double x, double y) {
            double Result = x+y;
            return Result;
    
        }

    },SUBTRAIR("-"){
        @Override
        public double executarOperacao(double x, double y) {
            double Result = x-y;
            return Result;
        }

    },MULTIPLICAR("*"){
        @Override
        public double executarOperacao(double x, double y) {
            double Result = x*y;
            return Result;
        }

    },DIVIDIR("/"){
        @Override
        public double executarOperacao(double x, double y) {
            double Result = x/y;
            return Result;
        }
    };

    private String valor;

    public String getValor() {
        return valor;
    }

    private Operacoes(String valor) {
        this.valor = valor;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operacoes{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

}
