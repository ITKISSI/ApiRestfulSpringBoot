package ma.eheio.ApiSpringBoot.repository;

import ma.eheio.ApiSpringBoot.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {



}
