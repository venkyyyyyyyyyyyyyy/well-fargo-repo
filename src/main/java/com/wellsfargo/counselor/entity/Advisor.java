package com.wellsfargo.counselor.entity;

import com.wellsfargo.counselor.entity.Client;
import jakarta.persistence.*;


import java.util.Set;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private Set<Client> clients;

    // Constructor
    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Default constructor (required by JPA)
    public Advisor() {}

    // Getters and Setters
    public Long getAdvisorId() { return advisorId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Set<Client> getClients() { return clients; }
    public void setClients(Set<Client> clients) { this.clients = clients; }
}
