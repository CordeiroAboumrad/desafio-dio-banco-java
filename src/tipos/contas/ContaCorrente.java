package tipos.contas;

import clientes.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente: ");
        super.imprimeInfosComuns();
    }
}
