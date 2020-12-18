package br.com.isidrocorp.dashcard.dto;

public class ConsolidadoStatus {
	private String nomeAgente;
	private float volume;
	private int status;
	private long numeroOP; //long é obrigatório quando temos contagem de registro	
	
	public ConsolidadoStatus(String nomeAgente, float volume, int status, long numeroOP) {
		super();
		this.nomeAgente = nomeAgente;
		this.volume = volume;
		this.status = status;
		this.numeroOP = numeroOP;
	}
	
	public String getNomeAgente() {
		return nomeAgente;
	}
	public float getVolume() {
		return volume;
	}
	public int getStatus() {
		return status;
	}
	public long getNumeroOP() {
		return numeroOP;
	}
	public void setNomeAgente(String nomeAgente) {
		this.nomeAgente = nomeAgente;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setNumeroOP(long numeroOP) {
		this.numeroOP = numeroOP;
	}
	
	
}
