package a08r.example.pick_location_integration_w_stores.stores.models.dto;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PickLocationIntegrationWStoresDTO {

//    private Long id;
    private int itemNumber;
    private String itemName;
    private float sBal;
    private String lastDate;
}
