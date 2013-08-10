package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROLEPRIVILEGE database table.
 * 
 */
@Entity
public class Roleprivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLEPRIVILEGE_ID_GENERATOR", sequenceName="SEQ_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLEPRIVILEGE_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Role
    @ManyToOne
	@JoinColumn(name="ROLEID")
	private Role role;

	//bi-directional many-to-one association to Menuprivilege
    @ManyToOne
	@JoinColumn(name="MENUPRIVILEGEID")
	private Menuprivilege menuprivilege;

    public Roleprivilege() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public Menuprivilege getMenuprivilege() {
		return this.menuprivilege;
	}

	public void setMenuprivilege(Menuprivilege menuprivilege) {
		this.menuprivilege = menuprivilege;
	}
	
}