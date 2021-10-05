package com.example.ensembltableapi.model;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
// import javax.annotation.Nullable;


@Entity
@Table(name = "analysis")
public class Analysis {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="analysis_id")
    private long analysis_id;

    @CreatedDate
    @Column(name="created", nullable = true)
    private Timestamp created;

    @Column(name="logic_name", length = 128)
    private String logic_name;

    @Column(name="db", length = 120, nullable = true)
    private String db;

    @Column(name="db_version", length = 40, nullable = true)
    private String db_version;

    @Column(name="db_file", length = 120, nullable = true)
    private String db_file;

    @Column(name="program", length = 80, nullable = true)
    private String program;

    @Column(name="program_version", length = 40, nullable = true)
    private String program_version;
    
    @Column(name="program_file", length = 80, nullable = true)
    private String program_file;

    @Column(name="parameters", nullable = true)
    private String parameters;

    @Column(name="module", length = 80, nullable = true)
    private String module;
    
    @Column(name="module_version", length = 40, nullable=true)
    private String module_version;

    @Column(name="gff_source", length = 40, nullable=true)
    private String gff_source;

    @Column(name="gff_feature", length = 40, nullable=true)
    private String gff_feature;


    public Analysis(long analysis_id, String logic_name, String db) {

    this.analysis_id = analysis_id;
    this.logic_name = logic_name;
    this.db = db;
    }
}
