package com.example.ensembltableapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
// import javax.annotation.Nullable;


@Entity
@Table(name = "exon")
@JsonIgnoreProperties(
        value = {"created_date", "modified_date"},
        allowGetters = true
)
public class Exon {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="exon_id", length = 10)
    private long exon_id;

    @ManyToOne
    @JoinColumn(name="seq_region_id")
    private SeqRegion seqRegion;

    @Column(name="seq_region_start", length = 10)
    private int seq_region_start;

    @Column(name="seq_region_end", length = 10)
    private int seq_region_end;

    @Column(name="seq_region_strand", length = 2)
    private int seq_region_strand;

    @Column(name="phase", length = 2)
    private int phase;

    @Column(name="end_phase", length = 2)
    private int end_phase;
    
    // @Value(1)
    @Column(name="is_current", length = 1)
    private short is_current;

    // @Value(0)
    @Column(name="is_constitutive", length = 1)
    private short is_constitutive;
    
    // @Nullable
    @Column(name="stable_id", length = 128, nullable = true)
    private String stable_id;
    
    // @Nullable
    @Column(name="version", nullable = true)
    private int version;
   
    // @Nullable
    @CreatedDate
    @Column(name="created_date", nullable=true)
    private Timestamp created_date;

    @LastModifiedDate
    @Column(name="modified_date", nullable = true)
    private Timestamp modified_date;



    public Exon(long exon_id, int seq_region_start, int seq_region_end) {

    this.exon_id = exon_id;
    this.seq_region_start = seq_region_start;
    this.seq_region_end = seq_region_end;
    }
}
