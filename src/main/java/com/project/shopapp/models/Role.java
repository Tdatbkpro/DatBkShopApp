package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class Role {
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @Column(name = "name" , nullable = false) // thuoc tinh name trong table khong duoc phep null
    private String name;

    public static String ADMIN = "ADMIN";
    public static String USER = "USER";

}
