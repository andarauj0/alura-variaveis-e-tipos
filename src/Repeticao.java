import java.util.Scanner;

public class Repeticao {

    public void contarDegraus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de Degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!!");
        scanner.close();
    }

    public void calcularArray(){
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < valores.length; i++){
        soma = soma + valores[i];
        }
        System.out.println("A soma total das receitas é: " + soma);
    }

    public void calcularPares(){
        System.out.println("Calcula os números pares entre os números digitados.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o número 2: ");
        int valor2 = scanner.nextInt();


        int soma = 0;

        for(int i = valor1; i <= valor2; i++){
            if (i % 2 == 0) {
                soma +=i;
            }
        }
        System.out.println("A soma dos números pares de " + valor1 + " a " + valor2 + " é: " + soma);
        scanner.close();
    }

    public void calcularFatorial(){
        System.out.println("Calcula o fatorial do número digitado.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = scanner.nextInt();

        long resultado = 1;

        if (valor < 0) {
            System.out.println("O valor deve ser positivo");
            return;
        }
        for(int i = valor; i > 0; i--) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + valor + " é: " + resultado);
        scanner.close();
    }

    public void encontrarMaior(){
        System.out.println("Encontra o maior número entre os digitados.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String valores[] = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : valores){
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }

        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }

    public void validarLogin(){
        System.out.println("Valida seu pin para logar.");
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;

        for (int i = 2; i >= 0; i-- ){
            System.out.println("Digite os números do pin:");
            int senhaDigitada = scanner.nextInt();
            if (senhaDigitada == senha){
                System.out.println("Acesso concedido.");
                return;
            }
            System.out.println("Senha incorreta, tente novamente. Você tem " + i + " tentativas restantes.");
        }
        System.out.println("Número de tentativas excedido, tente novamente em alguns minutos.");

        scanner.close();
    }

    public void validarNome(){
        System.out.println("Valida o nome inserido.");
        Scanner scanner = new Scanner(System.in);
        boolean i = true;


        while (i){
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        if (nome.length() >= 3){
            System.out.println("Nome '" + nome + "' cadastrado com sucesso.");
            i = false;
            return;
        }

            System.out.println("Nome inválido, tente novamente.");
        }
        scanner.close();
    }
    public void ContarPositivosENegativos(){
    System.out.println("Conta quantos dos números inseridos são positivos ou negativos.");
    Scanner scanner = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;
    int zero = 0;
    String entrada;

    do {
        System.out.println("Informe um número (ou 'fim' para encerrar): ");
        entrada = scanner.nextLine();

        if (!entrada.equalsIgnoreCase("FIM")) {
            int numero = Integer.parseInt(entrada);
            if (numero == 0) {
                zero += 1;
            } else if (numero > 0) {
                positivos += 1;
            } else {
                negativos += 1;
            }
        }
    } while (!entrada.equalsIgnoreCase("FIM"));

        System.out.println("Números positivos: " + positivos );
        System.out.println("Números negativos: " + negativos );
        if (zero != 0){
            System.out.println("Números neutros (0): " + zero);
        }
    scanner.close();
    }


}
