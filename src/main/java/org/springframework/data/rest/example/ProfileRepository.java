package org.springframework.data.rest.example;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
