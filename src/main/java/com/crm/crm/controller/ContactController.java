package com.crm.crm.controller;

import com.crm.crm.model.Contact;
import com.crm.crm.repository.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class ContactController {
    private ContactRepository contactRepository;
    public ContactController(ContactRepository contactRepository)
    {
        this.contactRepository=contactRepository;
    }
    @GetMapping("/contacts")
    List<Contact> contacts()
    {
        return ((List<Contact>) contactRepository.findAll());
    }
    @PostMapping("/contacts")
    ResponseEntity<Contact> createContact(@Validated @RequestBody Contact contact ) throws URISyntaxException{
        Contact result=contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }

}
