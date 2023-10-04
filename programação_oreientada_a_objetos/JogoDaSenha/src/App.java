public class App {
    public static void main(String[] args) throws Exception {
        JogoDaSenha jogo1 = new JogoDaSenha();
        JogoDaSenha jogo2 = new JogoDaSenha();
        
        int acertos1 = jogo1.fazerTentativa(5, 1, 30, 20,50);
        int acertos2 = jogo2.fazerTentativa();

        System.out.println(jogo1.getSenha());
        System.out.println(jogo2.getSenha());

        System.out.println("Acertos da tentaiva 1 é "+acertos1);
        System.out.println("Acertos da tentaiva 2 é "+acertos2);
    }
}
