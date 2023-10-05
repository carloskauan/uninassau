import java.lang.Math;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JogoDaSenha {
  
  private int[] senha = new int[30];
  private int pesquisas = 0;
  private int acertos = 0;

  public JogoDaSenha(){
    //Gerando senha
    for(int i = 0; i < 30; i++){
      int numero = (int)(Math.random() * 100) + 1;
    if(verificarNumero(numero, " ")){
        senha[i] = numero;
      }else{i--;} 
    }
  }

  //Metodos para tentativas
  public int fazerTentativa(int palpite1, int palpite2, int palpite3, int palpite4, int palpite5){
    int[] palpites = {palpite1, palpite2, palpite3, palpite4, palpite5};
    return verificarAcertos(palpites);
  }
  public int fazerTentativa(){
    int[] palpites = new int[5];
    for(int i = 0, c = 1; i < 5; i++, c++){
      System.out.print("Numero "+c+">>");
      palpites[i] = pegarValores();
    }
    return verificarAcertos(palpites);
  }


  //Verificar se numero existe no vetor
  private boolean verificarNumero(int numero, String type){
    for (int i : senha) {
      if(type == "tentativa") pesquisas++;
      if(numero == i){
        return false;
      }
    }
    return true;
  }


  //Verificar numeros acertados
  private int verificarAcertos(int[] palpites){
    acertos = 0;
    for (int i : palpites) {
    if(!(verificarNumero(i, "tentativa"))){
      acertos++;
      }
    }
    return acertos;
  }


  //Mostrar senha caso tenha 5 acertos
  public String getSenha(){
    if(acertos != 5){
      return "\nVocê não adivinhou a senha";
    }
    System.out.print("|");
    for (int i : senha) {
      System.out.print(" "+i+" ");
    }
    System.out.println("\nVoce adivinhou a senha com um total de "+pesquisas+" pesquisas");
    pesquisas = 0;
    return IntStream.of(senha).mapToObj(String::valueOf).reduce("", String::concat);
  }

  public int getContadorPesquisa(){
    return  pesquisas;
  }

  //Entarda de valores pelo terminal
  private int pegarValores(){
    Scanner numero = new Scanner(System.in);
    return numero.nextInt();
  }

   //Mostrar Senha
  private void mostrarSenha(){
    System.out.print("|");
    for (int i : senha) {
      System.out.print(" "+i+" ");
    }
    System.out.println("|");
  }
}
