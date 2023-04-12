package id.co.travel.customerapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "genderdata")
@Setter
@Getter
public class GenderData {
    @Id
    String genderid;

    @Column(name = "description")
    String description;

    @JsonBackReference
    @OneToMany(mappedBy = "gender")
    private List<Customer> customers;

}
