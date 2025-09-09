package dev.lucas.HistoricalArtifactsEncyclopedia.Repository;

import dev.lucas.HistoricalArtifactsEncyclopedia.entity.Artifacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtifactsRepository extends JpaRepository<Artifacts, Long> {
}
