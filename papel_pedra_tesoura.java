import java.util.Scanner;

public class papel_pedra_tesoura {
    public static void main(String[] args) {
        int jogador1, npc;
        Scanner teclado = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            System.out.println("Papel, Pedra e Tesoura");
            System.out.println();
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.print("Digite a opção desejada: ");

            jogador1 = teclado.nextInt();
            switch(jogador1) {
                case 1:
                    System.out.println("Jogador escolheu Pedra");
                    break;
                case 2:
                    System.out.println("Jogador escolheu Papel");
                    break;
                case 3:
                    System.out.println("Jogador escolheu Tesoura");
                    break;
                default:
                    System.out.println("Opção inválida");
                    return; // Finaliza o programa se a opção for inválida
            }

            npc = (int) (Math.random() * 3) + 1;
            System.out.print("NPC escolheu: ");
            switch (npc) {
                case 1:
                    System.out.println("Pedra");
                    break;
                case 2:
                    System.out.println("Papel");
                    break;
                case 3:
                    System.out.println("Tesoura");
                    break;
            }

            System.out.println();
            if (jogador1 == npc) {
                System.out.println("Empate");
            } else if ((jogador1 == 1 && npc == 3) || (jogador1 == 2 && npc == 1) || (jogador1 == 3 && npc == 2)) {
                System.out.println("Jogador1 Venceu");
            } else {
                System.out.println("Jogador1 Perdeu");
            }

            System.out.println();
            System.out.print("Deseja jogar novamente? (Digite 'sim' para continuar): ");
            String resposta = teclado.next();
            jogarNovamente = resposta.equalsIgnoreCase("sim");
        } while (jogarNovamente);

        System.out.println("Obrigado por jogar! Até a próxima.");
    }
}
