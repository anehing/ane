package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the MENUPRIVILEGE database table.
 * 
 */
@Entity
public class Menuprivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MENUPRIVILEGE_ID_GENERATOR", sequenceName="SEQ_MENUPRIVILEGE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MENUPRIVILEGE_ID_GENERATOR")
	private long id;

	private String function;

	private String menu;

	//bi-directional many-to-one association to Departmentprivilege
	@OneToMany(mappedBy="menuprivilege")
	private Set<Departmentprivilege> departmentprivileges;

	//bi-directional many-to-one association to Privilegemap
	@OneToMany(mappedBy="menuprivilege")
	private Set<Privilegemap> privilegemaps;

	//bi-directional many-to-one association to Roleprivilege
	@OneToMany(mappedBy="menuprivilege")
	private Set<Roleprivilege> roleprivileges;

    public Menuprivilege() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getMenu() {
		return this.menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Set<Departmentprivilege> getDepartmentprivileges() {
		return this.departmentprivileges;
	}

	public void setDepartmentprivileges(Set<Departmentprivilege> departmentprivileges) {
		this.departmentprivileges = departmentprivileges;
	}
	
	public Set<Privilegemap> getPrivilegemaps() {
		return this.privilegemaps;
	}

	public void setPrivilegemaps(Set<Privilegemap> privilegemaps) {
		this.privilegemaps = privilegemaps;
	}
	
	public Set<Roleprivilege> getRoleprivileges() {
		return this.roleprivileges;
	}

	public void setRoleprivileges(Set<Roleprivilege> roleprivileges) {
		this.roleprivileges = roleprivileges;
	}
	
}