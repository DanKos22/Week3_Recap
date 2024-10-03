package ie.atu.week3_recap;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "Please enter a bigger number")
    private long id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Positive(message = "Please enter a positive number")
    private double price;
}
