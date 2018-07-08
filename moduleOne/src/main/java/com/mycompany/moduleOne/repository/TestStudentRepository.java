package com.mycompany.moduleOne.repository;

import com.mycompany.moduleOne.entity.TestStudent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestStudentRepository extends PagingAndSortingRepository<TestStudent,Long> {

}
