public class ContaBancaria2 {
	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	public void imprimirSaldo(){
		System.out.println ("Saldo: " + this.saldo);
	}
	public void imprimirSaldoTotal(){
		double soma = this.saldo+this.limiteExtra;
		System.out.println("Saldo: " + soma);
	}
	public void imprimirAgencia(){
		System.out.println ("A agencia e: " + this.agencia);
	}
	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente e: " + this.contaCorrente);
	}
	public void imprimirTitular(){
		System.out.println ("O titular da conta e: " + this.titularConta);
	}
	public static void main (String args []){
		ContaBancaria2 cb1 = new ContaBancaria2();
		cb1.agencia = 3645;
		cb1.contaCorrente = 12766;
		cb1.saldo = 35.34;
		cb1.limiteExtra = 70;
		cb1.titularConta = "Pedro Henrique";
		cb1.imprimirTitular();
		cb1.imprimirAgencia();
		cb1.imprimirContaCorrente();
		cb1.imprimirSaldo();
		cb1.imprimirSaldoTotal();
		
	}
}
