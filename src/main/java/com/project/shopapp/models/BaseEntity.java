package com.project.shopapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at") // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private LocalDateTime createdAt;

    @Column(name = "updated_at") // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
