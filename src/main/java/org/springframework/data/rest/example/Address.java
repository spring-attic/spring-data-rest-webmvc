package org.springframework.data.rest.example;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@Entity
public class Address {

  @Id @GeneratedValue private Long         id;
  @ElementCollection private  List<String> lines;
  private                     String       city;
  private                     String       province;
  private                     String       postalCode;

  public Address() {
  }

  public Address(List<String> lines, String city, String province, String postalCode) {
    this.lines = lines;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
  }

  public Long getId() {
    return id;
  }

  public List<String> getLines() {
    return lines;
  }

  public void setLines(List<String> lines) {
    this.lines = lines;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override public String toString() {
    return "Address{" +
        "id=" + id +
        ", lines=" + lines +
        ", city='" + city + '\'' +
        ", province='" + province + '\'' +
        ", postalCode='" + postalCode + '\'' +
        '}';
  }

}
