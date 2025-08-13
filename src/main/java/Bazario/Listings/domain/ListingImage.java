package Bazario.Listings.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "listingImages")
public class ListingImage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String imagePath;

    @ManyToOne(targetEntity = Listing.class)
    @JoinColumn(name = "listing_id")
    private Listing listing;
}
