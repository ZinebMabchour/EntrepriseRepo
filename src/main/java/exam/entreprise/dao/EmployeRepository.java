package exam.entreprise.dao;

import exam.entreprise.bean.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    boolean existsByEmail(String email);

}
