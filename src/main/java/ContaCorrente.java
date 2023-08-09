package main.java;

public class ContaCorrente {
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    public void credito(double valor){
        this.saldo += valor;
    }

    public void debito(double valor){
        this.saldo -= valor;
    }

    public void resumo(){
        System.out.println(numero);
        System.out.println(primeiroTitular.nome);
        if (this.segundoTitular != null) System.out.println(segundoTitular.nome);
        System.out.println(saldo);
        System.out.println(limiteTotal+saldo);
        System.out.println(limiteTotal);
        if(estaDevedor()) System.out.println("Procure o seu gerente!");
    }

    public boolean estaDevedor(){
        return saldo < 0;
    }
}
