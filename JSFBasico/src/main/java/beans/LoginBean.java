package beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "login")
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String password;

	public LoginBean() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void registrar() {
		System.out.println("Pasando por login.registar()");
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("resultado.xhtml");
		} catch (IOException e) {
			System.out.println("Se produjo una excepcion:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
