package a08r.example.pick_location_integration_w_stores.stores.models.stores;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Temp_Store_Qty")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PickLocationIntegrationWStoresEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Item_No")
    private int itemNumber;
    @Column(name = "Item_Name")
    private String itemName;
    @Column(name = "SBal")
    private float sBal;
    @Column(name = "LastDate")
    private String lastDate;

}
