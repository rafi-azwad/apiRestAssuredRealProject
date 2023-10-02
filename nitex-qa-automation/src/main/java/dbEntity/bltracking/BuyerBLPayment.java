package dbEntity.bltracking;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue( value = "BUYER")
public class BuyerBLPayment extends BLPayment{
}
