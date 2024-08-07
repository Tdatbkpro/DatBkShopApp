package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class Product extends BaseEntity {
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;


    @Column(name = "name" , nullable = false, length = 350) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String name;

    private Float price;

    @Column(name = "thumbnail", length = 300) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String thumbnail;

    @Column(name = "description") // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String description;

    @ManyToOne // Nhieu sang 1
    @JoinColumn(name = "category_id")
    private Category category;
}
