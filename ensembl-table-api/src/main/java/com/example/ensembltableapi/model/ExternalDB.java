package com.example.ensembltableapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
// import javax.annotation.Nullable;

enum Type {
    ARRAY, ALT_TRANS, ALT_GENE, MISC,  LIT, PRIMARY_DB_SYNONYM, ENSEMBL;
}

enum Status {
    KNOWNXREF, KNOWN, XREF, PRED, ORTH, PSEUDO;
}

@Entity
@Table(name = "external_db")

public class ExternalDB {   
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="external_db_id")
    private int external_db_id;

    @Column(name="db_name", length = 100)
    private String db_name;

    @Column(name="db_release", length = 255, nullable = true)
    private String db_release;

    @Column(name="status")
    private Status status;

    @Column(name="priority")
    private int priority;

    // @Nullable
    @Column(name="db_display_name", length = 255, nullable = true)
    private String db_display_name;

    @Column(name="type")
    private Type type;

    // @Nullable
    @Column(name="secondary_db_name", length = 255, nullable = true)
    private String secondary_db_name;

    // @Nullable
    @Column(name="secondary_db_table", length = 255, nullable = true)
    private String secondary_db_table;
    
    // @Nullable
    @Column(name="description", nullable = true)
    private String description;

    
    public ExternalDB(int external_db_id, String db_name, String db_release) {

    this.external_db_id = external_db_id;
    this.db_name = db_name;
    this.db_release = db_release;
    }
}
