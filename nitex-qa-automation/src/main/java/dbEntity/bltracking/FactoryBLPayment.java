package dbEntity.bltracking;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue( value = "FACTORY")
public class FactoryBLPayment extends BLPayment{
}
