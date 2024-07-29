package semillero.ecosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semillero.ecosistema.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByNameContainingIgnoreCase(String name);

}
