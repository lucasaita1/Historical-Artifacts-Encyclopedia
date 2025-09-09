package dev.lucas.HistoricalArtifactsEncyclopedia.Mapper;

import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.HistoricPersonRequest;
import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.HistoricPersonResponse;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricPerson;
import lombok.experimental.UtilityClass;

@UtilityClass
public class HistoricPersonMapper {

    public static HistoricPerson toHistoricPerson(HistoricPersonRequest request){
        return HistoricPerson
                .builder()
                .name(request.name())
                .placeOfBirth(request.placeOfBirth())
                .description(request.description())
                .dateOfBirth(request.dateOfBirth())
                .ImgUrl(request.ImgUrl())
                .build();
    }

    public static HistoricPersonResponse toResponse(HistoricPerson historicPerson){
        return HistoricPersonResponse
                .builder()
                .id(historicPerson.getId())
                .name(historicPerson.getName())
                .placeOfBirth(historicPerson.getPlaceOfBirth())
                .description(historicPerson.getDescription())
                .dateOfBirth(historicPerson.getDateOfBirth())
                .ImgUrl(historicPerson.getImgUrl())
                .build();
    }
}
