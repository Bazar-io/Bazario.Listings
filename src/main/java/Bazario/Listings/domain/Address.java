package Bazario.Listings.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String city;
    private String zipcode;
    private String voivodeship;
}
