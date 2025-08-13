package Bazario.Listings.infrastructure.persistence;

import Bazario.Listings.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ListingRepository extends JpaRepository<Listing, UUID>{

}
