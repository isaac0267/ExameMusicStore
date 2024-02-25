package com.example.kea.musicStore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 55)
    private String name;

    @Column(nullable = false, length = 55)
    private String street;

    @Column(nullable = false, length = 55)
    private String city;

    @Column(nullable = false, length = 55)
    private int zip;

    @OneToMany(mappedBy = "store",cascade = CascadeType.REMOVE,orphanRemoval = true)
    private List<Album>albums; // den kode giver mig mulighed for at naviger fra store til album

    private LocalDateTime created;
    private LocalDateTime updateAt;


    @PrePersist
    protected void OnCreat() {
        this.created=LocalDateTime.now();
        this.updateAt=LocalDateTime.now();
    }
    @PreUpdate
    protected void onEdite() {
        this.updateAt=LocalDateTime.now();
    }



}
