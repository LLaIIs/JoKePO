
import java.util.Random;
import java.util.Scanner;
public class JoKenPo {
    static int opJog;
    static int opComp;
    static String[] itens = {"Pedra", "Papel", "Tesoura"};
    static int jogPoint;
    static int compPoint;


    static void novoJogo() {
        for (int c = 1;terminoDeJogo() == false; c++) {
            System.out.println("Round " + c);
            escolhaDoJogador();
            escolhaDoComputador();
            quemGanha();

        }
    }

    public static void main(String[] args) {

        /*System.out.println(opComp);*/

        novoJogo();
        System.out.println(terminoDeJogo());
        imprimirPlaca();


    }

    static void escolhaDoJogador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua opções:" +
                "[0] Pedra" +
                "[1] Papel" +
                "[2] Tesoura");
        opJog = sc.nextInt();
        System.out.println("Você escolheu: " + itens[opJog]);
    }

    static void escolhaDoComputador() {
        Random gerador = new Random();
        opComp = gerador.nextInt(3);
        System.out.println("O computador escolheu: " + itens[opComp]);

    }

    static void quemGanha() {
        escolhaDoComputador();
        if (opComp == 0 && opJog == 1 || opComp == 1 && opJog == 2 || opComp == 2 && opJog == 0) {
            System.out.println("O jogador venceu!!!");
            System.out.println("O computador perdeu!");
            jogPoint++;

            /*Jogador vence*/
        } else if (opJog == 0 && opComp == 1 || opJog == 1 && opComp == 2 || opJog == 2 && opComp == 0) {
            /*O computador vence*/
            System.out.println("O computador venceu !!!");
            System.out.println("O jogador perdeu !");
            compPoint++;
        } else if (opComp == opJog) {
            System.out.println("Empate ");

        }
    }

    static boolean terminoDeJogo() {
        if (compPoint == 2 ) {
            return true;
        }else if (jogPoint == 2){
            return true;
        }else{
            return false;
        }
    }
    static void imprimirPlaca(){
        if (terminoDeJogo()==true){
           if(compPoint==2){
               System.out.println("Computador venceu !!!");
               System.out.println("Placar: computador: "+compPoint+" jogador: "+jogPoint);
           } else if (jogPoint == 2){
               System.out.println("Jogador venceu !!! :)");
               System.out.println("Placar: computador: "+compPoint+" jogador: "+jogPoint);

           }        }
    }
}



