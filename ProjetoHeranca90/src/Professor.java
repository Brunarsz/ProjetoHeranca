import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa {
	
	private String profissao;
	private String login;
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	
	

}
