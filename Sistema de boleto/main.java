import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String nomePag;
        String nomeRec;
        double total;
        double parc;
        int quantParc;
        String CPFPag;
        String CPFRec;
        double juros = 0;
        int opcao;
        String tipoJuros = "Não há juros";

        Scanner ler = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Sistema de Boletos:");
        System.out.println("Qual o seu nome completo?");
        nomeRec = ler.nextLine();
        System.out.println("Qual é o seu CPF? (Formato xxx.xxx.xxx-xx)");
        CPFRec = ler.nextLine();

        System.out.println("Qual o nome completo do pagador?");
        nomePag = ler.nextLine();
        System.out.println("Qual é o CPF do pagador? (Formato xxx.xxx.xxx-xx)");
        CPFPag = ler.nextLine();

        System.out.println("Qual o valor total do boleto?");
        total = ler.nextDouble();
        System.out.println("Quantas parcelas será o boleto?");
        quantParc = ler.nextInt();
        System.out.println("Será aplicado juros? [Sim = 1][Não = 0]");
        opcao = ler.nextInt();
        ler.nextLine();
        if (opcao == 1) {
            System.out.println("Qual tipo de Juros será aplicado? [compostos ou simples]");
            tipoJuros = ler.nextLine().toLowerCase();
            System.out.println("Qual a porcentagem do juros?");
            juros = ler.nextDouble();
            juros /= 100;

        }
        parc = total / quantParc;

        System.out.println("\n \n \n");

        int x = 1;
        if (tipoJuros.equals("simples")) {
            parc = parc * (1 + juros);
        }
        for (x = 1; x <= quantParc; x++) {
            System.out.println(" - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Recebedor: " + nomeRec);
            System.out.println("CPF: " + CPFRec + "\n");
            System.out.println("Pagador: " + nomePag);
            System.out.println("CPF: " + CPFPag + "\n");
            System.out.println("Dívida total: R$" + total);
            System.out.println("Quantidade de parcelas: " + quantParc);
            System.out.println("Valor do Juros: " + juros + "%");
            System.out.println("Tipo de Juros: " + tipoJuros + "\n");

            if (tipoJuros.equals("compostos")) {
                parc = total * Math.pow((1 + juros), x) / quantParc;
            } else if (tipoJuros.equals("simples")) {
                parc = parc * (1 + juros * x);
            }
            System.out.println("Total da boleto: R$" + parc);

        }

        ler.close();

    }
}