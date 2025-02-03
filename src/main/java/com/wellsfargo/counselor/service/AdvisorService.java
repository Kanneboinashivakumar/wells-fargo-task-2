package com.wellsfargo.counselor.service;

import org.springframework.stereotype.Service;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import com.wellsfargo.counselor.entity.Advisor;
import java.util.List;
import java.util.Optional;

@Service
public class AdvisorService {

    private final AdvisorRepository advisorRepository;

    // Constructor Injection
    public AdvisorService(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    // ✅ Fetch all advisors
    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    // ✅ Get advisor by ID
    public Optional<Advisor> getAdvisorById(Long id) {
        return advisorRepository.findById(id);
    }

    // ✅ Save a new advisor
    public Advisor saveAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    // ✅ Delete an advisor by ID
    public void deleteAdvisor(Long id) {
        advisorRepository.deleteById(id);
    }
}
