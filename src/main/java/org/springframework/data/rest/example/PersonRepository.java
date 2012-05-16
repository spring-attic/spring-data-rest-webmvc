package org.springframework.data.rest.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@RestResource(path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

  @RestResource(path = "name", rel = "names")
  public List<Person> findByName(@Param("name") String name);

}
