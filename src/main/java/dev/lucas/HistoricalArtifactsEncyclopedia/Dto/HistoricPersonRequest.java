package dev.lucas.HistoricalArtifactsEncyclopedia.Dto;

import java.time.LocalDate;

public record HistoricPersonRequest (String name, String placeOfBirth, String description, LocalDate dateOfBirth, String ImgUrl) {
}
