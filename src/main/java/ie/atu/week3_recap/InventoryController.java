package ie.atu.week3_recap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @PostMapping("/addProduct")
    public String confirmDetails(@RequestBody Product product){
        String confirmationMessage = String.format("Product, ID = %d, name = %s, and price = %f has been added to our stock", product.getId(), product.getName(), product.getPrice());
        return confirmationMessage;
    }

}
