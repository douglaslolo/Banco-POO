package CONTA;

public class Conta {

	private int id;
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	public Conta(int numero, String cpf, int id) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.id = id;
	}

	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	/*
	 * public void setSaldo(double saldo) { this.saldo = saldo; }
	 */
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void debito(double valor) {
		if (valor >= this.saldo) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Você não tem saldo suficiente!");
		}
	}
}
