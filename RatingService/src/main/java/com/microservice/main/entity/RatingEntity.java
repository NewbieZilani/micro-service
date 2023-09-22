package com.microservice.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="rating")
public class RatingEntity {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

}
