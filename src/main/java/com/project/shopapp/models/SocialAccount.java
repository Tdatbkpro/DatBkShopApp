package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "social_accounts")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class SocialAccount {
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @Column(name = "provider" ,length = 20, nullable = false) // thuoc tinh name trong table khong duoc phep null
    private String provider;

    @Column(name = "provider_id" ,length = 50) // thuoc tinh name trong table khong duoc phep null
    private String providerId;

    @Column(name = "name" ,length = 150) // thuoc tinh name trong table khong duoc phep null
    private String name;

    @Column(name = "email" ,length = 150) // thuoc tinh name trong table khong duoc phep null
    private String email;

}
