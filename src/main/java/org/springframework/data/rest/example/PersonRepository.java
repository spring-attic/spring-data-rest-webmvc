package org.springframework.data.rest.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@RestResource(path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {
}
