package dev.lucas.HistoricalArtifactsEncyclopedia.Service;

import dev.lucas.HistoricalArtifactsEncyclopedia.Repository.HistoricPersonRepository;
import dev.lucas.HistoricalArtifactsEncyclopedia.entity.HistoricPerson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistoricPersonService {

    private final HistoricPersonRepository historicPersonRepository;

    public List<HistoricPerson> findAll(){
        return historicPersonRepository.findAll();
    }

    public HistoricPerson saveHistoricPerson(HistoricPerson historicPerson){
        return historicPersonRepository.save(historicPerson);
    }

    public Optional<HistoricPerson> findById (Long id){
        return historicPersonRepository.findById(id);
    }

    public void deleteById (Long id){
        historicPersonRepository.deleteById(id);
    }
}
