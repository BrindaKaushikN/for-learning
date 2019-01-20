package com.example.model;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(unique = true)
    @Size(max = 15, message = "Size.exceeded.Max.Limit")
    private String code;
    @Column
    private Double price;
    @Column
    private String description;


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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                // ", orders=" + orders +
                '}';
    }


}
