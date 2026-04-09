import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite o simbolo para o calculo (+), (-), (/), (*)");
        String simboloCalculo = sc.next();

        double resultado = 0.0;

        switch (simboloCalculo) {
            case "+" :
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 != 0 && !(n2 < 0)) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Operação Inválida");
                }
                break;
        }
        System.out.println("Resultado = " + resultado);
    }
}