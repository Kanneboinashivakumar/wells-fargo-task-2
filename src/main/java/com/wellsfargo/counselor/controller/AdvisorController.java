package com.wellsfargo.counselor.controller;

import org.springframework.web.bind.annotation.*;
import com.wellsfargo.counselor.service.AdvisorService;
import com.wellsfargo.counselor.entity.Advisor;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    private final AdvisorService advisorService;

    // Constructor Injection
    public AdvisorController(AdvisorService advisorService) {
        this.advisorService = advisorService;
    }

    // ✅ Fetch all advisors
    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorService.getAllAdvisors();
    }

    // ✅ Get advisor by ID
    @GetMapping("/{id}")
    public Optional<Advisor> getAdvisorById(@PathVariable Long id) {
        return advisorService.getAdvisorById(id);
    }

    // ✅ Add a new advisor
    @PostMapping
    public Advisor saveAdvisor(@RequestBody Advisor advisor) {
        return advisorService.saveAdvisor(advisor);
    }

    // ✅ Delete an advisor by ID
    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        advisorService.deleteAdvisor(id);
    }
}
