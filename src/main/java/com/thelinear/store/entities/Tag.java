package com.thelinear.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@ToString
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tags")
public class Tag{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false,name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User> users = new LinkedHashSet<>();


    public Tag(String name) {
        this.name = name;
    }
}
