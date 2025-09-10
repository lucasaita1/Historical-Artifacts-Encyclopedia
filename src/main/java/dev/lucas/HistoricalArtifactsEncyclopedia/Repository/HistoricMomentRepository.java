package dev.lucas.HistoricalArtifactsEncyclopedia.Repository;

import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricMoment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricMomentRepository extends JpaRepository<HistoricMoment, Long> {
}
