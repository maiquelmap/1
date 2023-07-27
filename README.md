<h1> Projeto 1 - Papel, pedra e tesoura</h1>

![github_cover_banner](https://meus-projetos.com/wp-content/uploads/2022/03/pedra-papel-tesoura.png)

<br>

#### O presente projeto foi utilizado  a liguagem **JAVA.**

Ferramenta o  **visual estudio code**
<br>
 Qualquer dúvida, sugestão ou contratação pode entrar em contato:
<br>

[Envie-me um e-mail](mailto:mapcoworking@outlook.com)

<br>
<p aling: "center">
Etapa 1: Inicialização e Entrada de Dados;
<br>
Etapa 2: Processamento do Jogo;
<br>
Etapa 3: Finalização e Saída de Dados.

<br>



### Fluxo do Jogo:

1. A atividade "Iniciar Jogo" representa o início do jogo.
2. O jogador é apresentado às opções de escolha: "Pedra", "Papel" ou "Tesoura".
3. A atividade "Obter Escolha do Jogador" aguarda a entrada do jogador.
4. O jogador insere sua escolha.
5. O valor inserido é armazenado na variável "jogador1" no programa.


<br>

### Etapa 1: Inicialização e Entrada de Dados
___

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

### Etapa 2: Processamento do Jogo
___
            System.out.println();
            if (jogador1 == npc) {
                System.out.println("Empate");
            } else if ((jogador1 == 1 && npc == 3) || (jogador1 == 2 && npc == 1) || (jogador1 == 3 && npc == 2)) {
                System.out.println("Jogador1 Venceu");
            } else {
                System.out.println("Jogador1 Perdeu");
            }

### Etapa 3: Finalização e Saída de Dados

___

            System.out.println();
            System.out.print("Deseja jogar novamente? (Digite 'sim' para continuar): ");
            String resposta = teclado.next();
            jogarNovamente = resposta.equalsIgnoreCase("sim");
        } while (jogarNovamente);

        System.out.println("Obrigado por jogar! Até a próxima.");
    }
}



