package dev.lucas.HistoricalArtifactsEncyclopedia.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "historicPerson")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
