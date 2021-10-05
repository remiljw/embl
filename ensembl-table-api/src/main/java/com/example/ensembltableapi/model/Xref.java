package com.example.ensembltableapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.persistence.Column;
import javax.persistence.JoinColumn;

enum Info {
    NONE, PROJECTION, MISC, DEPENDENT, DIRECT, SEQUENCE_MATCH, INFERRED_PAIR,
    PROBE, UNMAPPED, COORDINATE_OVERLAP, CHECKSUM;
}


@Entity
@Table(name = "xref")
public class Xref {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="xref_id", length = 10)
    private long xref_id;

    @ManyToOne
    @JoinColumn(name="external_db_id")
    private ExternalDB externalDB;

    @Column(name="dbprimary_acc", length = 512)
    private String dbprimary_acc;
    
    @Column(name="display_label", length = 512)
    private String display_label;

    @Column(name="version", nullable = true, length = 10)
    private String version;
    
    @Column(name="description", nullable = true)
    private String description;
   
    @Column(name="info_type")
    private Info info_type;

    @Column(name="info_text", length = 255)
    private String info_text;



    public Xref(long xref_id, String dbprimary_acc, String display_label) {

    this.xref_id = xref_id;
    this.dbprimary_acc = dbprimary_acc;
    this.display_label = display_label;
    }
}
