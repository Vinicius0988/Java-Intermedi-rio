public class App {
    public static void main(String[] args) throws Exception {
        
         /* for (TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }  */

        Pessoa pessoaFisisca = new Pessoa();
        Pessoa pessoaJuridica = new Pessoa();

        pessoaFisisca.setTipoDocumento(TipoDocumento.valueOf("CPF"));
        pessoaFisisca.setNumeroDocumento(pessoaFisisca.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaFisisca);

        pessoaJuridica.setTipoDocumento(TipoDocumento.valueOf("CNPJ"));
        pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaJuridica);

    }
}
