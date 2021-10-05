package com.example.ensembltableapi.model;


import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
// import javax.annotation.Nullable;


@Entity
@Table(name = "translation")
public class Translation {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="transaltion_id", length = 10)
    private int translation_id;

    @ManyToOne
    @JoinColumn(name="transcript_id")
    private Transcript transcript;

    @Column(name="seq_start", length = 10)
    private long seq_start;

    @Column(name="start_exon_id", length = 10)
    private long seq_region_id;

    @Column(name="seq_end", length = 10)
    private long seq_end;
    
    @Column(name="end_exon_id", length = 10)
    private long end_exon_id;


    @Column(name="stable_id", length = 128, nullable = true)
    private String stable_id;
    
    @Column(name="version", nullable = true)
    private short version;
   
    @CreatedDate
    @Column(name="created_date", nullable = true)
    private Timestamp created_date;

    @LastModifiedDate
    @Column(name="modified_date", nullable = true)
    private Timestamp modified_date;



    public Translation(int translation_id, int seq_start, int seq_end) {

    this.translation_id = translation_id;
    this.seq_start = seq_start;
    this.seq_end = seq_end;
    }
}
