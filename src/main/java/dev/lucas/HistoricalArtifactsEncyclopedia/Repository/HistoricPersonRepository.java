package dev.lucas.HistoricalArtifactsEncyclopedia.Repository;

import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricPersonRepository extends JpaRepository< HistoricPerson, Long> {
}
