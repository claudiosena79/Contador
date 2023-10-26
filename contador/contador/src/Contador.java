import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextInt();

        try {
            contarNumeros(numero1, numero2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo.");

        }

    }

    static void contarNumeros(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int indice = 1; indice <= (numero2 - numero1); indice++) {
                System.out.println(indice);
            }

        }

    }

}
