package com.tapiwanashembizvo.hilt.repositories;

import com.tapiwanashembizvo.hilt.models.BusinessUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusinessUnitRepository extends JpaRepository<BusinessUnit, Integer> {

    Optional<List<BusinessUnit>> findByBusinessNameAndBusinessEmail(String businessEmail, String businessName);
}
