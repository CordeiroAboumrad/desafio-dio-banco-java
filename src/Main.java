import clientes.Cliente;
import tipos.contas.Conta;
import tipos.contas.ContaCorrente;
import tipos.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente jp = new Cliente();
        Cliente lm = new Cliente();

        jp.setNome("JP");
        lm.setNome("LM");

        Conta cc = new ContaCorrente(jp);
        Conta cp = new ContaPoupanca(lm);

        cc.depositar(100.00);

        cc.transferir(50.00, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
