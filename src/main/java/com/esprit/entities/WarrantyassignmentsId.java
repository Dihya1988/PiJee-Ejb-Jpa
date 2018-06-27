package com.esprit.entities;
// Generated 27 juin 2018 23:49:29 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WarrantyassignmentsId generated by hbm2java
 */
@Embeddable
public class WarrantyassignmentsId implements java.io.Serializable {

	private int idCont;
	private int idWrr;

	public WarrantyassignmentsId() {
	}

	public WarrantyassignmentsId(int idCont, int idWrr) {
		this.idCont = idCont;
		this.idWrr = idWrr;
	}

	@Column(name = "idCont", nullable = false)
	public int getIdCont() {
		return this.idCont;
	}

	public void setIdCont(int idCont) {
		this.idCont = idCont;
	}

	@Column(name = "idWrr", nullable = false)
	public int getIdWrr() {
		return this.idWrr;
	}

	public void setIdWrr(int idWrr) {
		this.idWrr = idWrr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WarrantyassignmentsId))
			return false;
		WarrantyassignmentsId castOther = (WarrantyassignmentsId) other;

		return (this.getIdCont() == castOther.getIdCont()) && (this.getIdWrr() == castOther.getIdWrr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCont();
		result = 37 * result + this.getIdWrr();
		return result;
	}

}