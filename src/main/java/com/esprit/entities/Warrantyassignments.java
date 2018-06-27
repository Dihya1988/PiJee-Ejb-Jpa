package com.esprit.entities;
// Generated 27 juin 2018 23:49:29 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Warrantyassignments generated by hbm2java
 */
@Entity
@Table(name = "warrantyassignments", catalog = "bdnetjee")
public class Warrantyassignments implements java.io.Serializable {

	private WarrantyassignmentsId id;
	private Contracts contracts;
	private Warranties warranties;
	private Warrantyassignments warrantyassignments;
	private Date date;
	private Set<Warrantyassignments> warrantyassignmentses = new HashSet<Warrantyassignments>(0);

	public Warrantyassignments() {
	}

	public Warrantyassignments(WarrantyassignmentsId id, Contracts contracts, Warranties warranties, Date date) {
		this.id = id;
		this.contracts = contracts;
		this.warranties = warranties;
		this.date = date;
	}

	public Warrantyassignments(WarrantyassignmentsId id, Contracts contracts, Warranties warranties,
			Warrantyassignments warrantyassignments, Date date, Set<Warrantyassignments> warrantyassignmentses) {
		this.id = id;
		this.contracts = contracts;
		this.warranties = warranties;
		this.warrantyassignments = warrantyassignments;
		this.date = date;
		this.warrantyassignmentses = warrantyassignmentses;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idCont", column = @Column(name = "idCont", nullable = false)),
			@AttributeOverride(name = "idWrr", column = @Column(name = "idWrr", nullable = false)) })
	public WarrantyassignmentsId getId() {
		return this.id;
	}

	public void setId(WarrantyassignmentsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCont", nullable = false, insertable = false, updatable = false)
	public Contracts getContracts() {
		return this.contracts;
	}

	public void setContracts(Contracts contracts) {
		this.contracts = contracts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idWrr", nullable = false, insertable = false, updatable = false)
	public Warranties getWarranties() {
		return this.warranties;
	}

	public void setWarranties(Warranties warranties) {
		this.warranties = warranties;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "WarrantyAssignment_idCont", referencedColumnName = "idCont"),
			@JoinColumn(name = "WarrantyAssignment_idWrr", referencedColumnName = "idWrr") })
	public Warrantyassignments getWarrantyassignments() {
		return this.warrantyassignments;
	}

	public void setWarrantyassignments(Warrantyassignments warrantyassignments) {
		this.warrantyassignments = warrantyassignments;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warrantyassignments")
	public Set<Warrantyassignments> getWarrantyassignmentses() {
		return this.warrantyassignmentses;
	}

	public void setWarrantyassignmentses(Set<Warrantyassignments> warrantyassignmentses) {
		this.warrantyassignmentses = warrantyassignmentses;
	}

}