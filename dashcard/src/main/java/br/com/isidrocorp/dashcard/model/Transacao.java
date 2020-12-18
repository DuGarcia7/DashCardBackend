package br.com.isidrocorp.dashcard.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* nesta classe, vamos criar uma estrutura "equivalente" à estrutura
 * da tabela, porém com as nossas nomenclaturas e nosso estilo de escrita
 * 
 * o segredo, agora, é fazer esse "de-para" da nossa classe para a tabela
 */

@Entity // quando usamos @Entity indicamos que a classe é armazenável em BD
@Table(name = "mtb310_transaction") // a anotacao @Table permite especificar o nome da tabela
public class Transacao {
	
	@Id // indica que é chave-primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_transacao")
	private int id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@Column(name = "dispositivo")
	private int numDispositivo;
	
	@Column(name = "valor_solic")
	private float valorSolicitado;
	
	@Column(name = "valor_aut")
	private float valorAutorizado;
	
	@Column(name = "status")
	private int status;
	
	@ManyToOne
	@JoinColumn(name = "ag_financeiro")
	private AgenteFinanceiro agente;

	public int getId() {
		return id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public int getNumDispositivo() {
		return numDispositivo;
	}

	public float getValorSolicitado() {
		return valorSolicitado;
	}

	public float getValorAutorizado() {
		return valorAutorizado;
	}

	public int getStatus() {
		return status;
	}

	public AgenteFinanceiro getAgente() {
		return agente;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public void setNumDispositivo(int numDispositivo) {
		this.numDispositivo = numDispositivo;
	}

	public void setValorSolicitado(float valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}

	public void setValorAutorizado(float valorAutorizado) {
		this.valorAutorizado = valorAutorizado;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setAgente(AgenteFinanceiro agente) {
		this.agente = agente;
	}

	
	
}