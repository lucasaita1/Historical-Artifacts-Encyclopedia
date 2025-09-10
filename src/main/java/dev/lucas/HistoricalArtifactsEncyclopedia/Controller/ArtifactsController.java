package dev.lucas.HistoricalArtifactsEncyclopedia.Controller;


import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.ArtifactRequest;
import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.ArtifactResponse;
import dev.lucas.HistoricalArtifactsEncyclopedia.Mapper.ArtifactMapper;
import dev.lucas.HistoricalArtifactsEncyclopedia.Service.ArtifactsService;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.Artifacts;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("artifacts")
public class ArtifactsController {

    private final ArtifactsService artifactsService;

    @GetMapping
    public ResponseEntity<List<ArtifactResponse>> getAllArtifacts() {
        List<Artifacts> artifacts = artifactsService.findAll();
        List<ArtifactResponse> responses = artifacts.stream()
                .map(artifact -> ArtifactMapper.toResponse(artifact))
                .toList();
        return ResponseEntity.ok(responses);
    }

    @PostMapping
    public ResponseEntity<ArtifactResponse> saveNewArtifact (@RequestBody ArtifactRequest request){
        Artifacts artifacts = ArtifactMapper.toArtifact(request);
        Artifacts newArtifact = artifactsService.saveArtifact(artifacts);
        return ResponseEntity.status(HttpStatus.CREATED).body(ArtifactMapper.toResponse(newArtifact));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<ArtifactResponse> findById (@PathVariable Long id){
        return artifactsService.findById(id)
                .map(artifacts -> ResponseEntity.ok(ArtifactMapper.toResponse(artifacts)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping
    public void delete (@PathVariable Long id){
        artifactsService.DeleteById(id);
    }

}
