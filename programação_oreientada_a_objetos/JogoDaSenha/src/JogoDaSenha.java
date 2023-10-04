import java.lang.Math;
import java.util.Scanner;

public class JogoDaSenha {
  
  private int[] senha = new int[30];
  private int acertos = 0;

  public JogoDaSenha(){
    gerarSenha();
  }

  public int fazerTentativa(int palpite1, int palpite2, int palpite3, int palpite4, int palpite5){
    int[] palpites = {palpite1, palpite2, palpite3, palpite4, palpite5};
    return verificarAcertos(palpites);
  }
  public int fazerTentativa(){
    int[] palpites = new int[5];
    for(int i = 0, c = 1; i < 5; i++, c++){
      System.out.print("NumerO "+c+">>");
      palpites[i] = pegarValores();
    }
    return verificarAcertos(palpites);
  }

  private int pegarValores(){
    Scanner numero = new Scanner(System.in);
    return numero.nextInt();
  }

  //Gerar Senha
  private void gerarSenha(){
    for(int i = 0; i < 30; i++){
      int numero = (int)(Math.random() * 100) + 1;
      if(verificarNumero(numero)){
        senha[i] = numero;
      }else{i--;} 
    }
  }
  //Verificar numero gerado
  private boolean verificarNumero(int numero){
    for (int i : senha) {
      if(numero == i){
        return false;
      }
    }
    return true;
  }

  private int verificarAcertos(int[] palpites){
    acertos = 0;
    for (int i : palpites) {
    if(!(verificarNumero(i))){
      acertos++;
      }
    }
    return acertos;
  }

  //Mostrar Senha
  private void mostrarSenha(){
    System.out.print("|");
    for (int i : senha) {
      System.out.print(" "+i+" ");
    }
    System.out.println("|");
  }

  public String getSenha(){
    if(acertos != 5){
      return "Você não adivinhou a senha";
    }
    System.out.print("|");
    for (int i : senha) {
      System.out.print(" "+i+" ");
    }
    mostrarSenha();
    return "Voce acertou a senha";
  }
}
