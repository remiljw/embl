package com.example.ensembltableapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

// import javax.annotation.Nullable;


@Entity
@Table(name = "coord_system")
public class CoordSystem {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="coord_system_id", length = 10)
    private long coord_system_id;

    @Column(name="species_id", length = 10)
    private long species_id;

    @Column(name="name", length = 40)
    private String name;

    @Column(name="version", nullable = true, length = 255)
    private String version;

    @Column(name="rank")
    private int rank;


    @Column(name="attrib", nullable = true)
    private String attrib;

   
    public CoordSystem(int coord_system_id, String name, int rank) {

    this.coord_system_id = coord_system_id;
    this.name = name;
    this.rank = rank;
    }

}
