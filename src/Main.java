
public class Main {

    public static void main(String[] args) {

         /* Ex 1:

         String nome = "Andrey";

         int idade = 20;

         double altura = 1.70;

         boolean estudante = true;

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("É estudante: " + estudante); */


        /* EX 2:

        double valorDouble = 19.5;

        System.out.println("O Valor inteiro do produto é: " + (int) valorDouble);
        System.out.println("O Valor inteiro do produto é: " + Math.floor(valorDouble));
        */


        /* Ex 3:
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        System.out.println("A média das notas é: " + (nota1 + nota2 + nota3) / 3);
        */



        /* Ex 4:

        int celsius = 20;

        double farenheit = ((double) celsius * 9/5 + 32 );

        System.out.println("A temperatura em graus Fahrenheit é: " + farenheit);
        */

        /* Ex 5:

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupery";
        int paginas = 96;
        double preco = 39.90;


       char categoria = 'F';

        System.out.println("Livro cadastrado: "+(titulo) +", de "+ (autor) +". Possui "+ (paginas)  +" páginas, custa R$ "+ (preco) +".");

         */






        /* Ex 6:
        double preco = 150.00;

        String categoria;

        if (preco <= 50.0) {
            categoria = "Econômico";
        } else if (preco >= 50.01 && preco <= 200.00) {
            categoria = "Intermediário";
        } else if (preco > 200) {
            categoria = "Premium";
        } else {
            categoria = "Valor inválido";
        }

        System.out.println("Categoria do produto: " + (categoria) + "." );

         */



        /* Ex 7

        int numero = 7;

        if ( numero % 2 == 0 ) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

         */



        /* Ex 8

        double valorReais = 451.50;

        double cambio = (valorReais / 5.25);

        System.out.println("O valor em dólares é: US$" + (cambio) + ".");

         */




        /* Ex 9

        int idade = 17;
        String mensagem;

        if (idade >= 18) {

             mensagem = "Você é maior de idade.";
        } else {
             mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);

         */

         /* Ex 10:

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 100;

        double autMax =  consumoMedio * capacidadeTanque;
        double autAtual = consumoMedio * combustivelAtual;

        if (autAtual < distanciaViagem) {
            System.out.println("Você não conseguirá completar a viagem sem abastecer, precisará abastecer em no máximo " + (distanciaViagem - autAtual) + "km.");
        } else {
            System.out.println("Você conseguirá completar a viagem sem abastecer, com mais " +(autAtual - distanciaViagem)+ "km de autonomia.");
        }
        System.out.println("Autonomia maxima do veículo: " +(autMax)+ "km.");
        System.out.println("Autonomia atual: " +(autAtual)+ "km.");

          */



    }
}