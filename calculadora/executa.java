package calculadora;

public class executa {
    public void calcula(oper op, numero a, numero b) {
        numero res = new numero();

        if (op.getOp().equals("+")) {
            res.setValor(a.getValor() + b.getValor());
            System.out.println("O resultado da operação de soma é "+ res.getValor());
        } else if (op.getOp().equals("-")) {
            res.setValor(a.getValor() - b.getValor());
            System.out.println("O resultado da operação de subtração é " + res.getValor());

        } else if (op.getOp().equals("*")) {
            res.setValor(a.getValor() * b.getValor());
            System.out.println("O resultado da operação de multiplicação é " + res.getValor());

        } else if (op.getOp().equals("/")) {
            if (b.getValor() == 0) {
                System.out.println("Não é possível dividir por 0\n");
            } else {
                res.setValor(a.getValor() / b.getValor());
                System.out.println("O resultado da divisão é " + res.getValor());
            }
        } else {
            System.out.println("Operação não implemtada\n");
        }
    }

}
