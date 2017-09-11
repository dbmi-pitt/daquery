package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NOTIFICATIONS database table.
 * 
 */
@Entity
@Table(name="NOTIFICATIONS")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification extends DaqueryObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(length=1000)
	private String message;

	@Column(nullable=false, length=100)
	private String type;

	public Notification() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}