package sg.edu.nus.iss.app.HttpSession.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Item {
    @NotNull(message = "Item name cannot be empty or null")
    @Size(min=3, message="Item name must not be less than 3 characters")
    private String name;

    @Min(value=1, message = "Min quantity is 1")
    @Digits(integer=5, message="Quantity is 5 digits and 2 decimals", fraction = 2)
    private Integer quantity;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}

    
}
