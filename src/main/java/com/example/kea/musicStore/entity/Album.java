package com.example.kea.musicStore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Album extends DateTimeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 55)
    private String title;
    @Column(nullable = false, length = 55)
    private String artist;
    @Column(nullable = false, length = 55)
    private String genre;
    @Column(nullable = false)
    private boolean availability;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store; // Den kode vil lave en fremmede nøgle column in 'album' tabel, som lave en reference til butik.

    private LocalDateTime created;

    @Column(name = "updated_album")
    private LocalDateTime updateAt;

    @PrePersist
    protected void onCreate() {
        this.created = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpDate() {
        this.updateAt = LocalDateTime.now();
    }


    public Album(String title, String artist, String genre, boolean availability) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.availability = availability;

    }


}
