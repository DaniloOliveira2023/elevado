import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int valor = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor");
        x = s.nextInt();
        System.out.println("Digite a potência");
        y = s.nextInt();
        for (int i=0; i<y; i++) {
        if (y<=0) {
            System.out.println("Não pode ser calculado um valor elevado a zero");
        }
        else {
            valor = valor * x;
            System.out.println(valor);
        }
            }
        }
    }