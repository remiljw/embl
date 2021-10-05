package com.example.ensembltableapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// import javax.persistence.Column;


@Entity
@Table(name = "exon_transcript")
public class ExonTranscript {
    @Id
    private int rank;

    @ManyToOne
    @JoinColumn(name="exon_id")
    private Exon exon;

    @ManyToOne
    @JoinColumn(name="transcript_id")
    private Transcript transcript;

    
    public ExonTranscript(int rank, Exon exon, Transcript transcript) {

    this.rank = rank;
    this.exon = exon;
    this.transcript = transcript;
    }
}
