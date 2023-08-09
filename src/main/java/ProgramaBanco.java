package main.java;

public class ProgramaBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "1";
        conta.primeiroTitular = new Cliente();
        conta.primeiroTitular.nome = "Cainan";
        conta.saldo = 200;
        conta.limiteTotal = 400;

        conta.credito(650.5);
        conta.debito(150.9);
        conta.credito(65.7);
        conta.debito(50.2);

        conta.resumo();
    }
}
