package entidade;

import java.util.Date;
import java.util.Objects;

public class LogEntrada {
	
	private String nome;
	private Date momento;
	
	public LogEntrada(String nome, Date momento) {
		this.nome = nome;
		this.momento = momento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntrada other = (LogEntrada) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
