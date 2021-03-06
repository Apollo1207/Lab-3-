package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.SportBuild;

@Repository
public interface SportBuildRepository extends JpaRepository<SportBuild, Integer> {
}
