package fr.red.services.service;

import fr.red.services.domain.Employe;
import fr.red.services.repository.EmployeDbRepository;
import fr.red.services.repository.EmployeWebServiceRepository;
import fr.red.services.utils.FeatureToogleUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    private final EmployeDbRepository employeDbRepository;
    private final EmployeWebServiceRepository employeWebServiceRepository;
    private final FeatureToogleUtils featureToogleUtils;

    public EmployeService(EmployeDbRepository employeDbRepository,
                          EmployeWebServiceRepository employeWebServiceRepository,
                          FeatureToogleUtils featureToogleUtils) {
        this.employeDbRepository = employeDbRepository;
        this.employeWebServiceRepository = employeWebServiceRepository;
        this.featureToogleUtils = featureToogleUtils;
    }


    public List<Employe> findEmployes(){
        if(featureToogleUtils.isEmployesFromWebServiceEnabled()){
            return employeWebServiceRepository.findAll();
        }
        return employeDbRepository.findAll();
    }
}
