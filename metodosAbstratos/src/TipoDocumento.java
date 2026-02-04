public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeradorCpf.gerarCPF();
        }
    },
    CNPJ {
        @Override
        public String geraNumeroTeste() {
           return GeradorCpf.gerarCNPJ();
        }
    };

    public abstract String geraNumeroTeste();

}
