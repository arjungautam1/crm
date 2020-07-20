package com.crm.crm.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Contact {

    private @Id @GeneratedValue long id;
    private String firstName;
    private String lastName;
    private String email;

    private Contact()
    {

    }

   public Contact(String firstName,String lastName,String email)
   {
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;
   }


}
