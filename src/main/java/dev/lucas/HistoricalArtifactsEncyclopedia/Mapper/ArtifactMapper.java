package dev.lucas.HistoricalArtifactsEncyclopedia.Mapper;


import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.ArtifactRequest;
import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.ArtifactResponse;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.Artifacts;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ArtifactMapper {

    public static Artifacts toArtifact (ArtifactRequest request){
        return Artifacts
                .builder()
                .name(request.name())
                .description(request.description())
                .date(request.date())
                .museu(request.museu())
                .ImgUrl(request.ImgUrl())
                .build();
    }

    public static ArtifactResponse toResponse (Artifacts artifacts){
        return ArtifactResponse
                .builder()
                .id(artifacts.getId())
                .name(artifacts.getName())
                .description(artifacts.getDescription())
                .date(artifacts.getDate())
                .museu(artifacts.getMuseu())
                .ImgUrl(artifacts.getImgUrl())
                .build();
    }

}
