package dev.lucas.HistoricalArtifactsEncyclopedia.Dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ArtifactResponse(Long id, String name, String description, LocalDate date, String museu, String ImgUrl) {
}
