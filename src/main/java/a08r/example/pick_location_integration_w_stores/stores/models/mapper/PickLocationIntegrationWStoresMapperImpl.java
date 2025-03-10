package a08r.example.pick_location_integration_w_stores.stores.models.mapper;

import a08r.example.pick_location_integration_w_stores.stores.models.dto.PickLocationIntegrationWStoresDTO;
import a08r.example.pick_location_integration_w_stores.stores.models.stores.PickLocationIntegrationWStoresEntity;


public class PickLocationIntegrationWStoresMapperImpl implements IPickLocationIntegrationWStoresMapper {

    @Override
    public PickLocationIntegrationWStoresEntity pickLocationIntegrationWStoresDTOToPickLocationEntity(PickLocationIntegrationWStoresDTO pickLocationIntegrationWStoresDTO) {
        //updated for unit testing (shouldThrowNotNullExceptionWhenLabsDTOisNull-- method)
        if (pickLocationIntegrationWStoresDTO == null) {
            throw new NullPointerException("pickLocationDTO should not be null");
        }
        PickLocationIntegrationWStoresEntity pickLocationIntegrationWStoresEntity = new PickLocationIntegrationWStoresEntity();
        pickLocationIntegrationWStoresEntity.setItemNumber(pickLocationIntegrationWStoresDTO.getItemNumber());
        pickLocationIntegrationWStoresEntity.setItemName(pickLocationIntegrationWStoresDTO.getItemName());
        pickLocationIntegrationWStoresEntity.setSBal(pickLocationIntegrationWStoresDTO.getSBal());
        pickLocationIntegrationWStoresEntity.setLastDate(pickLocationIntegrationWStoresDTO.getLastDate());

        return pickLocationIntegrationWStoresEntity;
    }

    @Override
    public PickLocationIntegrationWStoresDTO pickLocationIntegrationWStoresEntityToPickLocationDTO(PickLocationIntegrationWStoresEntity pickLocationIntegrationWStoresEntity) {
        if (pickLocationIntegrationWStoresEntity == null) {
            throw new NullPointerException("pickLocationEntity should not be null");
        }

        PickLocationIntegrationWStoresDTO pickLocationIntegrationWStoresDTO = new PickLocationIntegrationWStoresDTO();
        pickLocationIntegrationWStoresDTO.setItemNumber(pickLocationIntegrationWStoresEntity.getItemNumber());
        pickLocationIntegrationWStoresDTO.setItemName(pickLocationIntegrationWStoresEntity.getItemName());
        pickLocationIntegrationWStoresDTO.setSBal(pickLocationIntegrationWStoresEntity.getSBal());
        pickLocationIntegrationWStoresDTO.setLastDate(pickLocationIntegrationWStoresEntity.getLastDate());
        return pickLocationIntegrationWStoresDTO;
    }
}


