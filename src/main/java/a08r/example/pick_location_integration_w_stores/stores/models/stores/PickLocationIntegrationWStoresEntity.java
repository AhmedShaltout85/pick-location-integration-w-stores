package a08r.example.pick_location_integration_w_stores.stores.models.stores;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "azonat")
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
    @Column(name = "item_number")
    private int itemNumber;
    @Column(name = "Item_Name")
    private String itemName;
    @Column(name = "SBal")
    private double sBal;
    @Column(name = "LastDate")
    private String lastDate;

}
