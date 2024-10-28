
package exam.entreprise.service;

import exam.entreprise.bean.Employe;
import exam.entreprise.dao.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    public Optional<Employe> getEmployeById(Long id) {
        return employeRepository.findById(id);
    }

    public String saveEmploye(Employe employe) {
        if (employeRepository.existsByEmail(employe.getEmail())) {
            return "Email already in use ";
        }
        employeRepository.save(employe);
        return "Employee is well added";
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}

