package com.example.phone_shop.model;
import jakarta.persistence.*;
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    public Cart() {
    }

    public Cart(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

