package edu.pitt.dbmi.daquery.common.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="SITE_CONNECTION")
public class SiteConnection extends DaqueryObject
{
	private static final long serialVersionUID = 98278298923423423l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    	
	
	@Expose
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="SITE_ID")
	private Site site;
	
	@Expose
	private String status;
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="NETWORK_ID")
    Network network;
    
    @Expose
    private String direction;
	
    public SiteConnection(){}
    
    public SiteConnection(Site site, Network net, SiteStatus status, ConnectionDirection dir)
    {
    	this.site = site;
    	this.network = net;
    	this.setStatusValue(status);
    	this.setDirectionValue(dir);
    }
    
	public long getId(){return(id);}
	public void setId(long val){id = val;}
    
	public Site getSite(){return(site);}
	public void setSite(Site s){site = s;}
	
	public String getStatus(){return(status);}
	public void setStatus(String stat){status = stat;}
	
	@Transient
	public SiteStatus getStatusValue() {
		if (status == null) {
			return null;
		}
		return SiteStatus.valueOf(status);
	}
	public void setStatusValue(SiteStatus statusValue) {
		if (statusValue == null) {
			status = null;
		} else {
			status = statusValue.name();
		}
	}
	
	public Network getNetwork(){return(network);}
	public void setNetwork(Network net){network = net;}
	
	public String getDirection(){return(direction);}
	public void setDirection(String dir){direction = dir;}
	
	@Transient
	public ConnectionDirection getDirectionValue() {
		if (direction == null) {
			return null;
		}
		return ConnectionDirection.valueOf(direction);
	}
	public void setDirectionValue(ConnectionDirection directionValue) {
		if (directionValue == null) {
			direction = null;
		} else {
			direction = directionValue.name();
		}
	}
	
	public static boolean isOutgoing(SiteConnection sc)
	{
		return(sc != null && sc.getDirectionValue() != null && sc.getDirectionValue().equals(ConnectionDirection.OUTGOING));
	}	
	public static boolean isIncoming(SiteConnection sc)
	{
		return(sc != null && sc.getDirectionValue() != null && sc.getDirectionValue().equals(ConnectionDirection.INCOMING));
	}
	public static boolean isPending(SiteConnection sc)
	{
		return(sc != null && sc.getStatusValue() != null && sc.getStatusValue().equals(SiteStatus.PENDING));
	}
	
	public static boolean isConnected(SiteConnection sc)
	{
		return(sc != null && sc.getStatusValue() != null && sc.getStatusValue().equals(SiteStatus.CONNECTED));
	}	
	
}
