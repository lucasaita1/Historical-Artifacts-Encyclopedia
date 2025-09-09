package dev.lucas.HistoricalArtifactsEncyclopedia.Controller;

import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.HistoricPersonRequest;
import dev.lucas.HistoricalArtifactsEncyclopedia.Dto.HistoricPersonResponse;
import dev.lucas.HistoricalArtifactsEncyclopedia.Mapper.HistoricPersonMapper;
import dev.lucas.HistoricalArtifactsEncyclopedia.Service.HistoricPersonService;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricPerson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("persons")
public class HistoricPersonController {

    private final HistoricPersonService historicPersonService;

    @GetMapping
    public ResponseEntity<List<HistoricPersonResponse>> getAllPersons(){
        List<HistoricPerson> persons = historicPersonService.findAll();
        List<HistoricPersonResponse> responses = persons.stream()
                .map(historicPerson -> HistoricPersonMapper.toResponse(historicPerson))
                .toList();
        return ResponseEntity.ok(responses);
    }

    @PostMapping
    public ResponseEntity<HistoricPersonResponse> savePerson(@RequestBody HistoricPersonRequest request){
        HistoricPerson person = HistoricPersonMapper.toHistoricPerson(request);
        HistoricPerson newPerson = historicPersonService.saveHistoricPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(HistoricPersonMapper.toResponse(newPerson));
    }

    @GetMapping
    public ResponseEntity<HistoricPersonResponse> getPersonById (@PathVariable Long id) {
        return historicPersonService.findById(id)
                .map(historicPerson -> ResponseEntity.ok(HistoricPersonMapper.toResponse(historicPerson)))
                .orElse(ResponseEntity.notFound().build());
    }

    public void deleteById (@PathVariable Long id){
        historicPersonService.deleteById(id);
    }


}
