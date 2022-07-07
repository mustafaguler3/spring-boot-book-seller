package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "description",nullable = false)
    private String description;
    @Column(name = "author",nullable = false)
    private String author;
    @Column(name = "price",nullable = false)
    private Double price;
    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;
}



























