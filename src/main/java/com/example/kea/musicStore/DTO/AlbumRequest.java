package com.example.kea.musicStore.DTO;

import com.example.kea.musicStore.entity.Album;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlbumRequest {
private int id;
private String title;
private String artist;
private String genre;
private boolean availability;


// now we can make the constructor for this class
  public AlbumRequest(String title,String artist,String genre,boolean availability) {
    this.title=title;
    this.artist=artist;
    this.genre=genre;
    this.availability=availability;
  }

  public static Album getAlbumEntity(AlbumRequest albumRequest) {
    return new Album(
       albumRequest.getTitle(),
       albumRequest.getArtist(),
       albumRequest.getGenre(),
       albumRequest.isAvailability()
    );
  }


}
