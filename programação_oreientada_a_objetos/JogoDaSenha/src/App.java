public class App {
    public static void main(String[] args) throws Exception {
        JogoDaSenha jogo1 = new JogoDaSenha();
        JogoDaSenha jogo2 = new JogoDaSenha();
        
        int acertos;

        //Teste do motodo fazerTentativa com parametros
        while(true){
            acertos = jogo1.fazerTentativa(gerarNumero(), gerarNumero(),gerarNumero(), gerarNumero(), gerarNumero());   
            if(acertos == 5){
                System.out.println(jogo1.getSenha());
                break;
            }
           System.out.println(jogo2.getSenha()+"\nNumero de acertos "+acertos+"\n");
        }

        //Teste do metodo fazerTentativa com entrada de valores pelo teclado
        while(true){
            acertos = jogo2.fazerTentativa();
            if(acertos == 5){
                System.out.println(jogo2.getSenha());
                break;
            }
            System.out.println(jogo2.getSenha()+"\nNumero de acertos "+acertos+"\n");
        }
    }
    static int gerarNumero(){
        return  (int)(Math.random() * 100) + 1;
    }
}
