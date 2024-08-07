package com.project.shopapp.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor // Ham khoi tao khong tham so
public class CategoryDTO {
@NotEmpty(message = "Category's name cannot be empty")
    private String name;

}
