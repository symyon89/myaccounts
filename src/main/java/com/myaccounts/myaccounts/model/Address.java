package com.myaccounts.myaccounts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Address {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "uuid2")
    private UUID id;

}
