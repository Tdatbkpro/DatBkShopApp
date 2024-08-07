package com.project.shopapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class BaseResponse {
    @JsonProperty("created_at") // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private LocalDateTime createdAt;

    @JsonProperty("updated_at") // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private LocalDateTime updatedAt;
}
