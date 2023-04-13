package id.co.travel.customerapp.repository;

import id.co.travel.customerapp.model.GenderData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderDataSDJRepo extends JpaRepository<GenderData, Character> {
    public GenderData findGenderDataByGenderid(String input);
}
