package pf.beans;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.context.PrimeFacesContext;
import org.primefaces.context.RequestContext;


public class PrimefacesBean implements Serializable{
	private String name;
	private String address;
	private byte addressNumber;
	private String cep;
	private String email;
	private String locale;
	private ComplementBean complement;
	
	public PrimefacesBean(){
        locale="es_ES";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(byte addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ComplementBean getComplement() {
		return complement;
	}

	public void setComplement(ComplementBean complement) {
		this.complement = complement;
	}

	public void calculateCep(ActionEvent evt){
		RequestContext reqCont=RequestContext.getCurrentInstance();
		address="Test Street";
		reqCont.execute("PF('diag').show()");
	}
	
	public void showComplement(){
		System.out.println("OK");
		System.out.println("Complement " +complement.getName());
		RequestContext.getCurrentInstance().execute("PF('diag').hide()");
	}
}
