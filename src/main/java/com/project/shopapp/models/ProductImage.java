package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products_images")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class ProductImage {
    public static final int MAXIMUM_IMAGES_PER_PRODUCT = 5;
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @ManyToOne // Nhieu sang 1
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "image_url", length = 300) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String imageUrl;

}
