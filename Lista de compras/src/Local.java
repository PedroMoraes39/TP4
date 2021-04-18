package lista_de_compras;
public class Local {
private String mercado;
private String acougue;
private String feira;
private String emporio;

public Local(String m, String a, String f, String e) {
	mercado = m;
	acougue = a;
	feira = f;
	emporio = e;
	

	}
	



public String getMercado() {
	return mercado;
}

public void setMercado(String mercado) {
	this.mercado = mercado;
}

public String getAcougue() {
	return acougue;
}

public void setAcougue(String acougue) {
	this.acougue = acougue;
}

public String getFeira() {
	return feira;
}

public void setFeira(String feira) {
	this.feira = feira;
}

public String getEmporio() {
	return emporio;
}

public void setEmporio(String emporio) {
	this.emporio = emporio;
}


}
