
public enum DiaSemana {

    SEGUNDA(1), TERÇA(2), QUARTA(3), QUINTA(4), SEXTA(5),
     SABADO(6), DOMINGO(7);

    private int valor;

    private DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
    
}
