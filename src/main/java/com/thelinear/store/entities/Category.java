package com.thelinear.store.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private byte id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    @Builder.Default
    private List<Product> products =  new ArrayList<Product>();

    public void addProducts(Product product) {
        this.products.add(product);
        product.setCategory(this);
    }

    public void removeProducts(Product product) {
        this.products.remove(product);
        product.setCategory(null);
    }


}
