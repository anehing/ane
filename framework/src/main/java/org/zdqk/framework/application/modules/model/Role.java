package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the ROLE database table.
 * 
 */
@Entity
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLE_ID_GENERATOR", sequenceName="SEQ_ROLL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLE_ID_GENERATOR")
	private long id;

	private String name;

	//bi-directional many-to-one association to Roleprivilege
	@OneToMany(mappedBy="role")
	private Set<Roleprivilege> roleprivileges;

    public Role() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Roleprivilege> getRoleprivileges() {
		return this.roleprivileges;
	}

	public void setRoleprivileges(Set<Roleprivilege> roleprivileges) {
		this.roleprivileges = roleprivileges;
	}
	
}