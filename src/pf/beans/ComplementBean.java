package pf.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class ComplementBean implements Serializable{
	private int idComp;
	private String name;
	private BigDecimal price;
	
	public int getIdComp() {
		return idComp;
	}
	public void setIdComp(int idComp) {
		this.idComp = idComp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
