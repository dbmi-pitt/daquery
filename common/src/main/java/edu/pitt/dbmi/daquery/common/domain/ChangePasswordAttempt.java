package edu.pitt.dbmi.daquery.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.gson.annotations.Expose;


@Entity
@Table(name="Change_Password_Attempt")
@NamedQueries({
    @NamedQuery(name = ChangePasswordAttempt.FIND_LAST_24_HOUR_BY_ID, query = "SELECT c FROM ChangePasswordAttempt c where user_id = :user_id and attempt_at > :ago_24")
})
public class ChangePasswordAttempt {

	private static final long serialVersionUID = 39250860772381l;
	
	public static final String FIND_LAST_24_HOUR_BY_ID = "ChangePasswordAttempt.findLast24HourById";
	
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
    @Expose
    @Column(name="USER_ID", nullable=false, length=50)
    private String userId;

	@Expose
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ATTEMPT_AT", nullable=false)
    private Date attemptAt;
    
    @Expose
    @Column(name="IP_ADDRESS")
    private String ipAddress;
    
    public ChangePasswordAttempt() {
    }
    
    public ChangePasswordAttempt(String userId, Date attempAt, String ipAddress) {
    	this.userId = userId;
    	this.attemptAt = attempAt;
    	this.ipAddress = ipAddress;
    }
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getAttemptAt() {
		return attemptAt;
	}

	public void setAttemptAt(Date attempAt) {
		this.attemptAt = attempAt;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
