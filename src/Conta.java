import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements Iconta{

    private static int agenciapadrao;
    private static int sequencial= 1;
    protected int agencia;
    protected int numero;
    protected Double saldo=0.0;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente,Banco banco){
        this.agencia = Conta.agenciapadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor,Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void  imprimiInfoComum(){
        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Banco: %s%n", banco.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);

    }
}
