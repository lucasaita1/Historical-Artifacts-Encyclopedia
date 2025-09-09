package dev.lucas.HistoricalArtifactsEncyclopedia.Service;

import dev.lucas.HistoricalArtifactsEncyclopedia.Repository.ArtifactsRepository;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.Artifacts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtifactsService {

    private final ArtifactsRepository artifactsRepository;

    public List<Artifacts> findAll(){
        return artifactsRepository.findAll();
    }

    public Artifacts saveArtifact (Artifacts artifacts){
        return artifactsRepository.save(artifacts);
    }

    public Optional<Artifacts> findById (Long id){
        return artifactsRepository.findById(id);
    }

    public void DeleteById (Long id){
        artifactsRepository.deleteById(id);
    }
}
