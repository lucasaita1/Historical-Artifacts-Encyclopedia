package dev.lucas.HistoricalArtifactsEncyclopedia.Service;

import dev.lucas.HistoricalArtifactsEncyclopedia.Repository.HistoricMomentRepository;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricMoment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistoricMomentService {

    private final HistoricMomentRepository historicMomentRepository;

    public List<HistoricMoment> findAll(){
        return historicMomentRepository.findAll();
    }

    public HistoricMoment saveMoment (HistoricMoment moment){
        return historicMomentRepository.save(moment);
    }

    public Optional<HistoricMoment> findById (Long id){
        return historicMomentRepository.findById(id);
    }

    public void deleteById (Long id){
        historicMomentRepository.deleteById(id);
    }
}
