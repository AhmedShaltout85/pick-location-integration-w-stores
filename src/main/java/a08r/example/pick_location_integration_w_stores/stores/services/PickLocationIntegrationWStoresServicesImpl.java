package a08r.example.pick_location_integration_w_stores.stores.services;


import a08r.example.pick_location_integration_w_stores.stores.errors.RecordNotFoundException;
import a08r.example.pick_location_integration_w_stores.stores.models.dto.PickLocationIntegrationWStoresDTO;
import a08r.example.pick_location_integration_w_stores.stores.models.mapper.IPickLocationIntegrationWStoresMapper;
import a08r.example.pick_location_integration_w_stores.stores.models.mapper.PickLocationIntegrationWStoresMapperImpl;
import a08r.example.pick_location_integration_w_stores.stores.models.stores.PickLocationIntegrationWStoresEntity;
import a08r.example.pick_location_integration_w_stores.stores.repositores.IPickLocationIntegrationWStoresRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class PickLocationIntegrationWStoresServicesImpl implements IPickLocationIntegrationWStoresServices {
    private final IPickLocationIntegrationWStoresRepository iPickLocationIntegrationWStoresRepository;
    private static final IPickLocationIntegrationWStoresMapper I_PICK_LOCATION_INTEGRATION_W_STORES_MAPPER = new PickLocationIntegrationWStoresMapperImpl();

    @Autowired
    public PickLocationIntegrationWStoresServicesImpl(IPickLocationIntegrationWStoresRepository iPickLocationIntegrationWStoresRepository) {
        this.iPickLocationIntegrationWStoresRepository = iPickLocationIntegrationWStoresRepository;
    }

    @Override
    public ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getPickLocationIntegrationWStores() {
        List<PickLocationIntegrationWStoresEntity> pickLocationIntegrationWStoresEntityList = iPickLocationIntegrationWStoresRepository
                .findAll();
        List<PickLocationIntegrationWStoresDTO> pickLocationIntegrationWStoresDTOS = pickLocationIntegrationWStoresEntityList
                .stream()
                .map(I_PICK_LOCATION_INTEGRATION_W_STORES_MAPPER::pickLocationIntegrationWStoresEntityToPickLocationDTO)
                .toList();
        return new ResponseEntity<>(pickLocationIntegrationWStoresDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<String>> storeQty(String storeName) {
        List<String> pickLocationIntegrationWStoresEntityList = iPickLocationIntegrationWStoresRepository.StoreQty(storeName);

        return new ResponseEntity<>(pickLocationIntegrationWStoresEntityList, HttpStatus.OK);
    }

//    @Override
//    public ResponseEntity<List<PickLocationIntegrationWStoresDTO>> getPickLocationIntegrationWStore(String storeName) {
//        List<PickLocationIntegrationWStoresEntity> pickLocationIntegrationWStoresEntityList = iPickLocationIntegrationWStoresRepository.findByStoreName(storeName);
//        List<PickLocationIntegrationWStoresDTO> pickLocationIntegrationWStoresDTOS = pickLocationIntegrationWStoresEntityList
//                .stream()
//                .map(I_PICK_LOCATION_INTEGRATION_W_STORES_MAPPER::pickLocationIntegrationWStoresEntityToPickLocationDTO)
//                .toList();
//        return new ResponseEntity<>(pickLocationIntegrationWStoresDTOS, HttpStatus.OK);
//    }
}
