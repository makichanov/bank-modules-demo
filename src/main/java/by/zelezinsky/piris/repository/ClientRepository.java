package by.zelezinsky.piris.repository;

import by.zelezinsky.piris.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

    Optional<Client> findByFirstNameAndLastNameAndMiddleName(String firstName, String lastName, String middleName);
}
