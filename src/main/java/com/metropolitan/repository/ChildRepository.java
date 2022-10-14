package com.metropolitan.repository;

import com.metropolitan.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChildRepository extends JpaRepository<Child,Long> {



    Optional<Child> findChildById(Long id);


}
