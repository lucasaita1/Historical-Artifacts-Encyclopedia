package dev.lucas.HistoricalArtifactsEncyclopedia.Controller;


import dev.lucas.HistoricalArtifactsEncyclopedia.Service.HistoricMomentService;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricMoment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "moment")
@RequiredArgsConstructor
public class HistoricMomentController {

    private final HistoricMomentService historicMomentService;

    @GetMapping
    public ResponseEntity<List<HistoricMoment>> getAllMoment(){
        List<HistoricMoment> moments = historicMomentService.findAll();
        return ResponseEntity.ok(moments);
    }

    @PostMapping
    public ResponseEntity<HistoricMoment> saveNewMoment(@RequestBody HistoricMoment historicMoment){
        return ResponseEntity.status(HttpStatus.CREATED).body(historicMomentService.saveMoment(historicMoment));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistoricMoment> findById(@PathVariable Long id){
        return historicMomentService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping ("/{id}")
    public void deleteById (@PathVariable Long id){
        historicMomentService.deleteById(id);
    }


}
