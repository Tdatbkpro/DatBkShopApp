package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Builder
@Getter
@Setter
@AllArgsConstructor // ham khoi tao
@NoArgsConstructor
public class User extends BaseEntity implements UserDetails {
    @Id // tu dong tang len 1
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // khong co id nao giong nhau ca
    private Long id;

    @Column(name = "fullname", length = 100) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String fullName;

    @Column(name = "phone_number", length = 11 , nullable = false) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String phoneNumber;

    @Column(name = "address", length = 300) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String address;

    @Column(name = "password", length = 100 , nullable = false) // thuoc tinh name trong table khong duoc phep null, max 350 ky tu
    private String password;

    @Column( name = "is_active")
    private boolean active;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "facebook_account_id")
    private int facebookAccountId;

    @Column(name = "google_account_id")
    private int googleAccountId;

    @ManyToOne // Nhieu sang 1
    @JoinColumn(name = "role_id")
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //authorities.add(new SimpleGrantedAuthority("ROLE_khDMIN"));
        String role = "ROLE_" + getRole().getName().toUpperCase();
        authorities.add(new SimpleGrantedAuthority(role));
        return authorities;
    }

    @Override
    public String getUsername() {
        return phoneNumber;
    }
}
