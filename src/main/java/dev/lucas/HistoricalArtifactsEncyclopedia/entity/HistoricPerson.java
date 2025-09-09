package dev.lucas.HistoricalArtifactsEncyclopedia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "historicPerson")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String placeOfBirth;

    private String description;

    private LocalDate dateOfBirth;

    private String ImgUrl;


}
