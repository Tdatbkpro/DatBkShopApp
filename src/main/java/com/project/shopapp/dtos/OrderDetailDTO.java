package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message = "Id tối thiểu >= 1")
    private Long orderId;

    @JsonProperty("product_id")
    @Min(value = 1, message = "ID sản phẩm >= 1")
    private Long productId;

    @Min(value = 0 , message = "Giá cả >= 0")
    private Float price;

    @JsonProperty("number_of_products")
    @Min(value = 1, message = "Số lượng sản phẩm >= 1")
    private int numberOfProducts;

    @JsonProperty("total_money")
    private Float totalMoney;

    private String color;
}
