package org.zdqk.framework.application.modules.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the STAFF database table.
 * 
 */
@Entity
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STAFF_ID_GENERATOR", sequenceName="SEQ_STAFF")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAFF_ID_GENERATOR")
	private long id;

	private String address;

	private long age;

    @Temporal( TemporalType.DATE)
	private Date birthday;

	private String callphone;

	private long departmentid;

	private String name;

	private String password;

	private long roleid;

	private String staffnum;

	private long status;

	//bi-directional many-to-one association to Privilegemap
	@OneToMany(mappedBy="staff")
	private Set<Privilegemap> privilegemaps;

    public Staff() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAge() {
		return this.age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCallphone() {
		return this.callphone;
	}

	public void setCallphone(String callphone) {
		this.callphone = callphone;
	}

	public long getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}

	public String getStaffnum() {
		return this.staffnum;
	}

	public void setStaffnum(String staffnum) {
		this.staffnum = staffnum;
	}

	public long getStatus() {
		return this.status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Set<Privilegemap> getPrivilegemaps() {
		return this.privilegemaps;
	}

	public void setPrivilegemaps(Set<Privilegemap> privilegemaps) {
		this.privilegemaps = privilegemaps;
	}
	
}