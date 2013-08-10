package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEPARTMENTPRIVILEGE database table.
 * 
 */
@Entity
public class Departmentprivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPARTMENTPRIVILEGE_ID_GENERATOR", sequenceName="SEQ_DEPARTMENTPRIVILEGE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPARTMENTPRIVILEGE_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Department
    @ManyToOne
	@JoinColumn(name="DEPARTMENTID")
	private Department department;

	//bi-directional many-to-one association to Menuprivilege
    @ManyToOne
	@JoinColumn(name="MENUPRIVILEGEID")
	private Menuprivilege menuprivilege;

    public Departmentprivilege() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Menuprivilege getMenuprivilege() {
		return this.menuprivilege;
	}

	public void setMenuprivilege(Menuprivilege menuprivilege) {
		this.menuprivilege = menuprivilege;
	}
	
}