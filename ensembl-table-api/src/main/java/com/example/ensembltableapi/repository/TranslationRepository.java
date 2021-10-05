package com.example.ensembltableapi.repository;

import com.example.ensembltableapi.model.Translation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;

@Repository
public interface TranslationRepository extends JpaRepository<Translation, Long> {
    
}
