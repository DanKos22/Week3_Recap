package ie.atu.week3_recap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class InventoryController {
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody Product product){
        String confirmationMessage = String.format("Received Details for ID %d, name = %s, and price = %d", product.getId(), product.getName(), product.getPrice());
        return confirmationMessage;
    }

}
