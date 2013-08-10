package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the DEPARTMENT database table.
 * 
 */
@Entity
public class Department implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPARTMENT_ID_GENERATOR", sequenceName="SEQ_DEPARTMENT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPARTMENT_ID_GENERATOR")
	private long id;

	private String departmentname;

	private String departmentnum;

	private long status;

	//bi-directional many-to-one association to Departmentprivilege
	@OneToMany(mappedBy="department")
	private Set<Departmentprivilege> departmentprivileges;

    public Department() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentnum() {
		return this.departmentnum;
	}

	public void setDepartmentnum(String departmentnum) {
		this.departmentnum = departmentnum;
	}

	public long getStatus() {
		return this.status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Set<Departmentprivilege> getDepartmentprivileges() {
		return this.departmentprivileges;
	}

	public void setDepartmentprivileges(Set<Departmentprivilege> departmentprivileges) {
		this.departmentprivileges = departmentprivileges;
	}
	
}