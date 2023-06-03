package com.example.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{
    
    private static final long serialVersionUID = 9069060843698080433L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 50)
    private String name;
    
    private String username;
    private String email;
    private boolean enabled;

    
}
