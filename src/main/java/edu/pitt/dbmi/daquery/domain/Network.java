package edu.pitt.dbmi.daquery.domain;

import edu.pitt.dbmi.daquery.util.PasswordUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.Objects;
import java.util.logging.Logger;


@Entity
@Table(name = "Network")
public class Network extends DaqueryObject {
	
	// ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_DAQUERY", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name="ID", unique = true, nullable = false)
    private long id;
    @Column(name="NAME", unique = true, length = 500, nullable = false)
    private String name;
    @Column(name="DESCRIPTION", length = 2000)
    private String description;
    
}
