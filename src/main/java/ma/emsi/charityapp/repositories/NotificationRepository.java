package ma.emsi.charityapp.repositories;


import ma.emsi.charityapp.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
