package com.algaworks.crm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
