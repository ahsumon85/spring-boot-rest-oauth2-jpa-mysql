package com.ahasan.rest.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
*
* @author Ahasan Habib
* @since 03 06 20
*/


@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name")
	private String name;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "permission_role", joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id") })
	private List<Permission> permissions;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
