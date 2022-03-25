package com.myaccounts.myaccounts.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "uuid2")
    private UUID id;

    @Column(length = 20)
    private String name;

    @Column(length = 25)
    private String email;

    @Column(length = 12)
    private String phone;
}
