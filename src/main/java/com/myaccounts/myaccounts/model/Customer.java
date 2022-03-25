package com.myaccounts.myaccounts.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "uuid2")
    private UUID id;

    @Column(columnDefinition = "boolean default false")
    private boolean isActive;

    @Column(columnDefinition = "boolean default false")
    private boolean isCompany;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String number;

    @OneToMany
    @JoinColumn
    private List<Contact> contactList;

    @OneToMany
    @JoinColumn
    private List<Address> addressList;

}
