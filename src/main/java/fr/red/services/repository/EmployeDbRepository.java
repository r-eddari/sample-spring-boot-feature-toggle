package fr.red.services.repository;

import fr.red.services.domain.Employe;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class EmployeDbRepository{

    public List<Employe> findAll() {
        return IntStream.range(1, 6).mapToObj(value -> "Employe "+value+" from DB").map(Employe::new).collect(
                Collectors.toList());
    }
}
