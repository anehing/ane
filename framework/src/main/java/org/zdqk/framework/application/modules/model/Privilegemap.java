package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PRIVILEGEMAP database table.
 * 
 */
@Entity
public class Privilegemap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRIVILEGEMAP_ID_GENERATOR", sequenceName="SEQ_PRIVILEGEMAP")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRIVILEGEMAP_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Staff
    @ManyToOne
	@JoinColumn(name="STAFFID")
	private Staff staff;

	//bi-directional many-to-one association to Menuprivilege
    @ManyToOne
	@JoinColumn(name="MENUPRIVILEGEID")
	private Menuprivilege menuprivilege;

    public Privilegemap() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public Menuprivilege getMenuprivilege() {
		return this.menuprivilege;
	}

	public void setMenuprivilege(Menuprivilege menuprivilege) {
		this.menuprivilege = menuprivilege;
	}
	
}