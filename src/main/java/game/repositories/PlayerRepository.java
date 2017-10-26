package game.repositories;


import game.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    Optional<Player> findById(Long Id);
    Optional<Player> findByUsername(String Username);

}

