package br.com.isidrocorp.dashcard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* nesta classe, vamos criar uma estrutura "equivalente" à estrutura
 * da tabela, porém com as nossas nomenclaturas e nosso estilo de escrita
 * 
 * o segredo, agora, é fazer esse "de-para" da nossa classe para a tabela
 */

@Entity // quando usamos @Entity indicamos que a classe é armazenável em BD
@Table(name = "mtb310_ag_financeiro") // a anotacao @Table permite especificar o nome da tabela
public class AgenteFinanceiro {
	
	@Id // indica que é chave-primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agente")
	private int id;
	
	@Column(name = "nome_agente", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "volume_transacional")
	private float volumeTransacional;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getVolumeTransacional() {
		return volumeTransacional;
	}

	public void setVolumeTransacional(float volumeTransacional) {
		this.volumeTransacional = volumeTransacional;
	}
	
}