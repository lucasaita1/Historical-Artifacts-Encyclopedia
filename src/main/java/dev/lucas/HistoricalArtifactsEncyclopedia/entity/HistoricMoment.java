package dev.lucas.HistoricalArtifactsEncyclopedia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    private String moment;
}
