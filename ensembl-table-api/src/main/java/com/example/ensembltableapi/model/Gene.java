package com.example.ensembltableapi.model;

import org.springframework.data.annotation.LastModifiedDate;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "gene")
public class Gene {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="gene_id", length = 10)
    private long transcript_id;

    @Column(name="biotype", length = 40)
    private String biotype;

    @ManyToOne
    @JoinColumn(name="analysis_id")
    private Analysis analysis;

    @ManyToOne
    @JoinColumn(name="seq_region_id")
    private SeqRegion seqRegion;

    @Column(name="seq_region_start", length = 10)
    private int seq_region_start;

    @Column(name="seq_region_end", length = 10)
    private int seq_region_end;

    @Column(name="seq_region_strand", length = 2)
    private int seq_region_strand;

    @ManyToOne
    @JoinColumn(name="xref_id")
    private Xref xref;

    // ensembl
    @Column(name="source", length = 40)
    private String source;
    
    @Column(name="description", nullable = true)
    private String description;

    // @Value(1)
    @Column(name="is_current", length = 1)
    private int is_current;

    @ManyToOne
    @JoinColumn(name="translation_id", nullable = true)
    private Translation translation;
    
    @Column(name="stable_id", length = 128, nullable = true)
    private String stable_id;

    @Column(name="version", nullable = true)
    private short version;

    @LastModifiedDate
    @Column(name="created_date", nullable = true)
    private Timestamp created_date;

    @LastModifiedDate
    @Column(name="modified_date", nullable = true)
    private Timestamp modified_date;



    public Gene(long transcript_id, int seq_region_start, int seq_region_end) {

    this.transcript_id = transcript_id;
    this.seq_region_start = seq_region_start;
    this.seq_region_end = seq_region_end;
    }
}
