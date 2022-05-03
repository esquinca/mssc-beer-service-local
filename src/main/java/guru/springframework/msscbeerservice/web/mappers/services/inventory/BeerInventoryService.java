package guru.springframework.msscbeerservice.web.mappers.services.inventory;

import java.util.UUID;

/**
 * Created by jt on 2019-06-07.
 */
public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);
}
