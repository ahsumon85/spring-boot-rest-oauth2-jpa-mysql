package com.ahasan.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author Ahasan Habib
* @since 03 06 20
*/


@Entity
@Table(name = "primary_key")
public class PrimaryKeyStored {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "pr_key_id")
	private Long primaryKeyId;

	@Column(name = "table_name")
	private String tableName;

	@Column(name = "pr_key")
	private int primaryKey;

	public Long getPrimaryKeyId() {
		return primaryKeyId;
	}

	public void setPrimaryKeyId(Long primaryKeyId) {
		this.primaryKeyId = primaryKeyId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}

}
