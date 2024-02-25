package com.example.kea.musicStore.DTO;

import com.example.kea.musicStore.entity.Album;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlbumResponse {
    private int id;
    private String title;
    private String genre;
    private boolean availability;


    // make two attribute that will give os the option to make sure we can see when the

    private LocalDateTime created;
    private LocalDateTime update;


    public AlbumResponse(Album album) {
     this.id=album.getId();
     this.title=album.getTitle();
     this.genre=album.getGenre();
     this.availability=album.isAvailability();


    }

}
