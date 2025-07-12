package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int nmenores, n;
        double percentualMenores, mediaAltura;
        n = input.nextInt();
        String[] nome = new String[n];
        double[] idade = new double[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do pessoa " + i + ":");
            nome[i] = input.next();
            System.out.println("Digite o idade " + i + ":");
            idade[i] = input.nextDouble();
            System.out.println("Digite o altura " + i + ":");
            altura[i] = input.nextDouble();
        }
        nmenores = 0;
        mediaAltura = 0.0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                nmenores++;
            }
            mediaAltura += altura[i];
        }

        percentualMenores = ((double) nmenores / n) * 100.0;


        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menso de 16 anos: %1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);

            }

        }


    }
}
