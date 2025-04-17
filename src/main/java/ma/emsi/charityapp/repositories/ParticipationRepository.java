package ma.emsi.charityapp.repositories;

import ma.emsi.charityapp.entities.Participation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {
}
