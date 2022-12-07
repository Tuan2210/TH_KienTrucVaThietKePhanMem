package iuh.se.trainingCK_DesignPatterns.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iuh.se.trainingCK_DesignPatterns.entities.Nexus;

@Repository
public interface NexusRepo extends JpaRepository<Nexus, String>{

}
