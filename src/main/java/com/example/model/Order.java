package com.example.model;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @Size(max = 15, message = "Size.exceeded.Max.Limit")
    private String code;
    @Column
    private String description;
    @Column
    private String customerName;
    @Column
    private String address;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column
    private Long quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
