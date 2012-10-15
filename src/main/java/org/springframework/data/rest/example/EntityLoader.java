package org.springframework.data.rest.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jon Brisbin
 */
@Named("entityLoader")
public class EntityLoader {

  private static final Logger LOG = LoggerFactory.getLogger(EntityLoader.class);

  @Inject
  private PersonRepository  people;
  @Inject
  private AddressRepository addresses;
  @Inject
  private ProfileRepository profiles;

  @PostConstruct
  private void load() {

    Address addr = addresses.save(new Address(
        Arrays.asList("123 W. 1st St."),
        "Univille",
        "US",
        "12345"
    ));
    LOG.info("  **** Saved Address: " + addr);

    Profile twitter = profiles.save(new Profile("twitter", "http://twitter.com/john_doe"));
    LOG.info("  **** Saved Profile: " + twitter);

    Map<String, Profile> profs = new HashMap<String, Profile>();
    profs.put("twitter", twitter);

    Person johnDoe = people.save(new Person(
        "John Doe",
        Arrays.asList(addr),
        profs
    ));
    LOG.info("  **** Saved Person: " + johnDoe);

  }

}
