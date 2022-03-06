package tipos.contas;

import clientes.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente: ");
        super.imprimeInfosComuns();
    }
}
