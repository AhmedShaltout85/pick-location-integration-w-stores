package a08r.example.pick_location_integration_w_stores.stores.controllers;


import a08r.example.pick_location_integration_w_stores.stores.models.dto.PickLocationIntegrationWStoresDTO;
import a08r.example.pick_location_integration_w_stores.stores.services.IPickLocationIntegrationWStoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping(path = "/api/v1/pick-loc-w-stores")
@CrossOrigin
//TODO://http://localhost:9999/pick-location-integration-w-stores/api/v1/pick-loc-w-stores
//TODO: we use @CrossOrigin to enable CORS for this controller (this mean no need to using https://localhost:9999)
//TODO: https://documenter.getpostman.com/view/11963423/2sAXxQcrcV => POSTMAN DOCUMENTATION
public class PickLocationIntegrationWStoresController {
    private final IPickLocationIntegrationWStoresServices iPickLocationIntegrationWStoresServices;


    @Autowired
    public PickLocationIntegrationWStoresController(IPickLocationIntegrationWStoresServices iPickLocationIntegrationWStoresServices) {
        this.iPickLocationIntegrationWStoresServices = iPickLocationIntegrationWStoresServices;
    }

    //TODO: GET http://localhost:9999/pick-location-integration-w-stores/api/v1/pick-loc-w-stores/store-name/مخزن فرع البلد
    @GetMapping(path ="/store-name/{storeName}")
    public ResponseEntity<List<String>> getStoreQty(@PathVariable String storeName){

//        ResponseEntity<List<String>> lists = iPickLocationIntegrationWStoresServices.storeQty(storeName);
//        Objects.requireNonNull(lists.getBody()).forEach(System.out::println);
        return this.iPickLocationIntegrationWStoresServices.storeQty(storeName);
    }
//    //TODO: GET http://localhost:9998/pick-location-integration-w-stores/api/v1/pick-loc-w-stores/s-name/مخزن فرع البلد
//    @GetMapping(path ="/s-name/{storeName}")
//    public ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getStoreQtyBySName(@PathVariable String storeName){
//        return this.iPickLocationIntegrationWStoresServices.getPickLocationIntegrationWStore(storeName);
//    }
 //TODO: GET http://localhost:9998/pick-location-integration-w-stores/api/v1/pick-loc-w-stores/all
    @GetMapping(path ="/all")
    public ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getStoreQtyAll(){
        return this.iPickLocationIntegrationWStoresServices.getPickLocationIntegrationWStores();
    }

}
