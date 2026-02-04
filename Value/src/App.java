public class App {
    public static void main(String[] args) throws Exception {
        
        DiaSemana[] dias = DiaSemana.values();

       for (int i=0; i<dias.length; i++) {
            System.out.println(dias[i]);
        } 

        for (DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }

        System.out.println(DiaSemana.valueOf("DOMINGO"));

        

    }
}
