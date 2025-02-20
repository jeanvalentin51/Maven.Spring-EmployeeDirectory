package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.entities.Employee;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
