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
@Table(name = "NodeBlog")
public class NodeBlogEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long blog_id;
    private String blogDetails;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id",referencedColumnName = "id")
    private NodeStudentEntity student;
}
