package com.example.ensembltableapi.controller;


import com.example.ensembltableapi.model.*;
import com.example.ensembltableapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ExonController {

    @Autowired
    private ExonTranscriptRepository exonTranscriptRepository;




    @GetMapping("/transcripts/{transcriptId}/exons")
    public List<Exon> getExonsbyTranscriptId(@PathVariable Long transcriptId) {
        return exonTranscriptRepository.findByTranscriptId(transcriptId);
    }

}
