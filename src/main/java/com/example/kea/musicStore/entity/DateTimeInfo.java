package com.example.kea.musicStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class DateTimeInfo {
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
