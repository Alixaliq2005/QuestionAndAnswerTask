
//package com.example.academy.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//import lombok.experimental.SuperBuilder;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@FieldDefaults(level = AccessLevel.PROTECTED)
//@ToString
//@EqualsAndHashCode
//@SuperBuilder
//@EntityListeners({CoreEntityListener.class})
//@MappedSuperclass
//public class CoreEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",nullable = false)
//    String id;
//    @Column(name= "create_time",nullable = false)
//    Long createTime;
//    @Column(name= "status",nullable = false)
//    String status;
//    @Column(name= "insert_time",nullable = false)
//    Long insertDate;
//    @Column(name= "modification_date",nullable = false)
//    Long modificationDate;
//    @Column(name= "modification_time",nullable = false)
//    Long modificationTime;
//    @Column(name= "created_time",nullable = false)
//    Long createdTime;
//}
