package com.nodemanager.node_manager_rest_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "NodeContact")
public class NodeContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contact_id;
    private String email;
    private String phone_number;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private NodeStudentEntity student;
}
