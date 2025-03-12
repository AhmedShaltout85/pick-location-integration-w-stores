package a08r.example.pick_location_integration_w_stores.stores.services;

import a08r.example.pick_location_integration_w_stores.stores.models.dto.PickLocationIntegrationWStoresDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPickLocationIntegrationWStoresServices {

    ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getPickLocationIntegrationWStores();
    ResponseEntity<List<String>> storeQty(String storeName);
//    ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getPickLocationIntegrationWStore(String storeName);



}
