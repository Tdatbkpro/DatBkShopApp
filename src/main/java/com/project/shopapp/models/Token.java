package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class Token {
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @Column(name = "token" ,length = 255, nullable = true) // thuoc tinh name trong table khong duoc phep null
    private String token;

    @Column(name = "token_type" ,length = 50, nullable = true) // thuoc tinh name trong table khong duoc phep null
    private String tokenType;

    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    private boolean revoked;
    private boolean exprired;

    @ManyToOne // Nhieu sang 1
    @JoinColumn(name = "user_id")
    private User user;
}
