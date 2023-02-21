import java.util.Scanner;
public class Escada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que 1: ");
        int Escada = scanner.nextInt();

        for(int i = 1; i <= Escada; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}