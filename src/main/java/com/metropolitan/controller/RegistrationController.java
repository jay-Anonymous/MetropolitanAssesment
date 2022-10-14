package com.metropolitan.controller;


import com.metropolitan.model.Child;
import com.metropolitan.service.ChildService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/child")
public class RegistrationController {

    private final ChildService childService;

    public RegistrationController(ChildService childService) {
        this.childService = childService;
    }


    @PostMapping("/addchild")
    public ResponseEntity<Child> addChild(@RequestBody Child child) {
        Child newChild = childService.add1(child);
        return new ResponseEntity<>(newChild, HttpStatus.CREATED);
    }


    @PutMapping({"/editchild"})
    public ResponseEntity<Child> editChild1(@RequestBody Child child) {
        Child updateChild = this.childService.updateChild(child);
        return new ResponseEntity(updateChild, HttpStatus.OK);
    }

    @GetMapping({"/allchildren"})
    public ResponseEntity<List<Child>> getAlL() {
        List<Child> children = this.childService.findAllChildren();
        return new ResponseEntity(children, HttpStatus.OK);
    }

    @GetMapping({"/search/{id}"})
    public ResponseEntity<Child> getChildById(@PathVariable("id") Long id) {
        Child child = this.childService.findChildById(id);
        return new ResponseEntity(child, HttpStatus.OK);
    }

}
