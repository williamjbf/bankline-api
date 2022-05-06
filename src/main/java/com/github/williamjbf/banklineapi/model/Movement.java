package com.github.williamjbf.banklineapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movement")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    private String description;
    private Double value;
    @Enumerated(EnumType.STRING)
    private TypeMovement typeMovement;
}
