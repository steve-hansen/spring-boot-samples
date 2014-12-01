package com.hansen.domain;

// provides a Repository object, but no default methods
//import org.springframework.data.repository.Repository;
//public interface RwsOfferReposittory extends Repository<RwsOffer, Long>

// provides basic crud methods
//import org.springframework.data.jpa.repository.JpaRepository;
//public interface RwsOfferRepository extends JpaRepository<RwsOffer, Long>

// CrudRepository seems to give the best set of initial operations
// there are likely other subclasses of Repository
import org.springframework.data.repository.CrudRepository;
public interface RwsOfferRepository extends CrudRepository<RwsOffer, Long>
{
    // Define other desired methods ... if named appropriately, the implementation will be provided automatically
   // RwsOffer findByNameAndCountryAllIgnoringCase(String name, String country);
}

