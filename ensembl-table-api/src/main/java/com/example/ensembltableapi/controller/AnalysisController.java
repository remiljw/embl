package com.example.ensembltableapi.controller;


import com.example.ensembltableapi.model.Analysis;
import com.example.ensembltableapi.repository.AnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
public class AnalysisController {
    @Autowired
    private AnalysisRepository analysisRepository;

    @GetMapping("/questions")
    public Page<Analysis> getQuestions(Pageable pageable) {
        return analysisRepository.findAll(pageable);
    }

}
