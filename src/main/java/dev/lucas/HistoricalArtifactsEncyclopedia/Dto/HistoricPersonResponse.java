package dev.lucas.HistoricalArtifactsEncyclopedia.Dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record HistoricPersonResponse (Long id, String name, String placeOfBirth, String description, LocalDate dateOfBirth, String ImgUrl){
}
