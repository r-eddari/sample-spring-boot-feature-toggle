package fr.red.services.controller;

import fr.red.services.domain.Employe;
import fr.red.services.service.EmployeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employes")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping
    public ResponseEntity<List<Employe>> getEmployes(){
        return ResponseEntity.ok(employeService.findEmployes());
    }
}
