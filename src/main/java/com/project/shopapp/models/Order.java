package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "orders")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class Order {
    @Id // tu dong tang len 1
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "fullname", length = 100) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String fullName;

    @Column(name = "phone_number", length = 11 , nullable = false) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String phoneNumber;

    @Column(name = "email" , length = 100)
    private String email;

    @Column(name = "address", length = 300) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String address;

    @Column(name = "note", length = 300) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String note;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "status")
    private String status;

    @Column(name = "total_money")
    private Float totalMoney;

    @Column(name = "shipping_method")
    private String shippingMethod;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "shipping_date")
    private LocalDate shippingDate;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "active")
    private boolean active = true;
}
