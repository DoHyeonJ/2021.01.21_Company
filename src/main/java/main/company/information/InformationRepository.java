package main.company.information;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Transactional(readOnly = true)
public interface InformationRepository extends JpaRepository<Information, Long> {

    Optional<Information> findByIdx(Long aLong);

}
