package dbEntity.organogram;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "operational_country" )
public class OperationalCountry {

    @Id
    private Long id;

    @Column( name = "name" )
    private String name;
}
