package com.metropolitan.service;


import com.metropolitan.exception.UserNotFoundException;
import com.metropolitan.model.Child;
import com.metropolitan.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private ChildRepository childRepository;

    public ChildService() {
    }

    public Child add1(Child child) {
        return childRepository.save(child);
    }


    public List<Child> findAllChildren() {
        return this.childRepository.findAll();
    }

    public Child updateChild(Child child) {
        return (Child) this.childRepository.save(child);
    }

    public Child findChildById(Long id) {
        return (Child) this.childRepository.findChildById(id).orElseThrow(() -> {
            return new UserNotFoundException("Community of id  " + id + " was not found");
        });
    }
}
