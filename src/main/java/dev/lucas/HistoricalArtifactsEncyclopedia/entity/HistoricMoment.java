package dev.lucas.HistoricalArtifactsEncyclopedia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "historicMoment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricMoment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moment;
}
