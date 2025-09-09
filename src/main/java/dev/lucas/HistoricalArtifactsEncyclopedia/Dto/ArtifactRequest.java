package dev.lucas.HistoricalArtifactsEncyclopedia.Dto;


import java.time.LocalDate;


public record ArtifactRequest(String name, String description, LocalDate date, String museu, String ImgUrl) {
}
