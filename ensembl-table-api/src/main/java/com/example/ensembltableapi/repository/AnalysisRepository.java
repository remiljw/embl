package com.example.ensembltableapi.repository;

import com.example.ensembltableapi.model.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Long> {
    
}