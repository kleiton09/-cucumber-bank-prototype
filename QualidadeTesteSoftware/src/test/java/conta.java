import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class conta {
	
	int clienteEspecial;
	int clienteComum;
	boolean tipoCliente;
	int saque;
	int saldoAtual;
	
	/**
	 * 
	 * @param tipoCliente Setando a variável tipoCliente
	 */
	public void setTipoCliente(boolean tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	/**
	 * 
	 * @return retornando a variável tipoCliente
	 */
	public boolean getTipoCliente() {
		return tipoCliente;
	}
	
	/**
	 * 
	 * @param clienteEspecial Setando a variável clienteEspecial
	 */
	public void setClienteEspecial(int clienteEspecial) {
		if(tipoCliente == true) {
			this.clienteEspecial = clienteEspecial;
		
		}else {
			this.clienteComum = clienteComum;
		}
	}
	
	/**
	 * 
	 * @return retornando a variável clienteEspecial
	 */
	public int getClienteEspecial() {
		return clienteEspecial;
	}
	
	/**
	 * 
	 * @param clienteComum Setando a variável clienteComum
	 */
	public void setClienteComum(int clienteComum) {
		this.clienteComum = clienteComum;
	}
	
	/**
	 * 
	 * @return retornando a variável clienteComum
	 */
	public int getClienteComum() {
		return clienteComum;
	}
	
	/**
	 * 
	 * @param saque Setando a variável saque
	 */
	public void setSaque(int saque) {
		this.saque = saque;
	}
	
	/**
	 * 
	 * @return retornando a variável saque
	 */
	public int getSaque() {
		return saque;
	}
	
	/**
	 * 
	 * @param saldoAtual Setando a variável saldoAtual
	 */
	public void setSaldoAtual(int saldoAtual) {
		if(tipoCliente == true) {
		this.saldoAtual =  saque - clienteEspecial;
		}else {
			this.saldoAtual = saque - clienteComum;
		}
	}
	
	/**
	 * 
	 * @return retornando a variável saldoAtual
	 */
	public int getSaldoAtual() {
		return saldoAtual;
	}
	
	/**
	 * 
	 * @param int1 Método para um cliente especial com saldo negativado
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		clienteEspecial = int1;

		if (clienteEspecial != -200) {

			throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}
	
	
	/**
	 * 
	 * @param int2 Método para quando o cliente especial negativado solicitar um saque
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		saque = int2;
		if (saque != 100) {
			throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}

	/**
	 * 
	 * @param int3 Método para quando o cliente especial negativado solicitar um saque, o banco aceitará porém aumentará a dívida
	 */
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int3) {
		// Write code here that turns the phrase above into concrete actions

		if (tipoCliente = true && clienteEspecial < 0) {
			saldoAtual = int3;
			System.out.println("Saldo Atual: " + saldoAtual);
		} else {
			throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}

	
	/**
	 * 
	 * @param int1 Método para um cliente comum com saldo negativado
	 */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

		clienteComum = int1;
		
		if (clienteComum != -300) {

			throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}

	/**
	 * 
	 * @param int2 Método para quando um cliente comum com saldo negativado solicitar o saque
	 */
	@When("Solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		
		saque = int2;
		
		if(saque != 200) {
		
		throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}

	
	/**
	 * 
	 * @param Método para quando um cliente comum com saldo negativado solicitar o saque, o banco negará o saque e mostrará a mensagem "Saldo insuficiente"
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		// Write code here that turns the phrase above into concrete actions
		
		if(saldoAtual != 100 && tipoCliente == false && clienteComum < 0) {
			saldoAtual = clienteComum;
			System.out.print("Saldo insuficiente: " + saldoAtual);
		}else {
		throw new io.cucumber.java.PendingException("Este passo Falhou");
		}
	}
}
