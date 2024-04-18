package develhope.esercizio80springrepositories2.repositories;

import develhope.esercizio80springrepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages",
        collectionResourceDescription = @Description("this is the repo-prog-languages description"),
        collectionResourceRel = "programming language",
        itemResourceDescription = @Description("single programming language description"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
