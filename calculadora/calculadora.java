package calculadora;

import java.util.Scanner;


public class calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        numero num1 = new numero();
        numero num2 = new numero();
        oper oper = new oper();
        executa executa = new executa();

        System.out.print("Entre com a operação desejada ");
        oper.setOp(leia.next());
        System.out.print("Entre com o primeiro numero da operação ");
        num1.setValor(leia.nextDouble());
        System.out.print("Entre com o segundo numero da operação ");
        num2.setValor(leia.nextDouble());
        leia.close();
        System.out.printf("Dados inseridos: \n");
        System.out.printf("Operação: %s\n", oper.getOp());
        System.out.printf("Primeiro número " + num1.getValor() + " e segundo número " + num2.getValor() + "\n");
        executa.calcula(oper, num1, num2);

    }
}