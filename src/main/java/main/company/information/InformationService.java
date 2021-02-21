package main.company.information;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InformationService {

    private final InformationRepository informationRepository;

    public Information addSettings(Information information) {
        Information addInformation = informationRepository.save(information);
        return addInformation;
    }

}
