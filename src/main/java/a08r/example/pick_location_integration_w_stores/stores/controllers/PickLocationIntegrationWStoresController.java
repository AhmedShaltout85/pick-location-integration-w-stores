package a08r.example.pick_location_integration_w_stores.stores.controllers;


import a08r.example.pick_location_integration_w_stores.stores.models.dto.PickLocationIntegrationWStoresDTO;
import a08r.example.pick_location_integration_w_stores.stores.services.IPickLocationIntegrationWStoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/pick-loc-w-stores")
@CrossOrigin
//TODO://http://localhost:9999/pick-location/api/v1/pick-loc-w-stores
//TODO: we use @CrossOrigin to enable CORS for this controller (this mean no need to using https://localhost:9999)
//TODO: https://documenter.getpostman.com/view/11963423/2sAXxQcrcV => POSTMAN DOCUMENTATION
public class PickLocationIntegrationWStoresController {
    private final IPickLocationIntegrationWStoresServices iPickLocationIntegrationWStoresServices;


    @Autowired
    public PickLocationIntegrationWStoresController(IPickLocationIntegrationWStoresServices iPickLocationIntegrationWStoresServices) {
        this.iPickLocationIntegrationWStoresServices = iPickLocationIntegrationWStoresServices;
    }

    @GetMapping(path ="/store-name/{storeName}")
    public ResponseEntity<List<String>> getStoreQty(@PathVariable String storeName){

        return this.iPickLocationIntegrationWStoresServices.storeQty(storeName);
    }

}
