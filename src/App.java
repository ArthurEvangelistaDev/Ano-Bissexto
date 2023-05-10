import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um ano para validar: ");
        System.out.println(validaAno(scanner.nextInt()));
        scanner.close();

    }

    public static String validaAno(int ano) {
        return ano % 400 == 0 ? "\n Ano BISSEXTO"
                : (ano % 4 == 0 && ano % 100 != 0) ? "\n Ano BISSEXTO" : "\n Não é Bissexto";
    }
}