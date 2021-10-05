package com.example.ensembltableapi.repository;

import com.example.ensembltableapi.model.CoordSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;

@Repository
public interface CoordSystemRepository extends JpaRepository<CoordSystem, Long> {
    
}
