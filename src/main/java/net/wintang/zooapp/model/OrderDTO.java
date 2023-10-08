package net.wintang.zooapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.wintang.zooapp.entity.User;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private int id;

    private LocalDateTime createdDate;

    private float total;

    private String paymentMethod;

    private String qrCodeUrl;

    private String username;

    private User customer;
}