package ma.eheio.ApiSpringBoot.service;

import lombok.Data;
import ma.eheio.ApiSpringBoot.model.Employee;
import ma.eheio.ApiSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long Id) {
        return employeeRepository.findById(Id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = (Employee) employeeRepository.save(employee);
        return savedEmployee;
    }


}
