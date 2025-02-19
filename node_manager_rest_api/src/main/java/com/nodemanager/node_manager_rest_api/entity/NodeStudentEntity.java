package com.nodemanager.node_manager_rest_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//getter and Setter from Lombog and @NoArgsConstructor @AllArgsConstructor from lombok dependency
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity marks a class as a JPA entity.
//JPA entities are Java classes that can be mapped to database tables
@Entity
@Table(name = "NodeStudent")
public class NodeStudentEntity {
    //@Id Annotation makes id as primary key followed by strategy og the id generation
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private NodeContactEntity contact;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<NodeBlogEntity> blog;

}
