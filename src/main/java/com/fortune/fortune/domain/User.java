package com.fortune.fortune.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", updatable = false, insertable = false)
    private UUID id;

    private String nickname;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "birth_time")
    private LocalTime birthTime;

    private String gender;

    private String email;

    /*@AllArgsConstructor lombok의 해당 어노테이션으로 대체 가능함
    public User(UUID id, String nickname, LocalDate birthDate, LocalTime birthTime, String gender) {
        this.id = id;
        this.nickname = nickname;
        this.birthDate = birthDate;
        this.birthTime = birthTime;
        this.gender = gender;
    }*/
}
