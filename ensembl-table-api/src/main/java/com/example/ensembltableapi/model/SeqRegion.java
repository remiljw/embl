package com.example.ensembltableapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;


@Entity
@Table(name ="seq_region")
public class SeqRegion {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="seq_region_id")
    private long seq_region_id;

    
    @Column(name="name",length = 255)
    private String name;

    @ManyToOne
    @JoinColumn(name="coord_system_id")
    private CoordSystem coordSystem;
    
    @Column(name="length", length = 10)
    private int length;



    public SeqRegion(long seq_region_id, String name, CoordSystem coordSystem) {

    this.seq_region_id = seq_region_id;
    this.name = name;
    this.coordSystem = coordSystem;
    }
}
