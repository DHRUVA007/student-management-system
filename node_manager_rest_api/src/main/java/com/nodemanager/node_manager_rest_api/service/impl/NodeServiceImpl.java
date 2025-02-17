package com.nodemanager.node_manager_rest_api.service.impl;

import com.nodemanager.node_manager_rest_api.entity.NodeBlogEntity;
import com.nodemanager.node_manager_rest_api.entity.NodeContactEntity;
import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;
import com.nodemanager.node_manager_rest_api.repository.NodeBlogRepo;
import com.nodemanager.node_manager_rest_api.repository.NodeContactRepo;
import com.nodemanager.node_manager_rest_api.repository.NodeStudentRepo;
import com.nodemanager.node_manager_rest_api.service.NodeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Implementation of the NodeService interface.
 * This service provides operations related to NodeEntity management.
 * Uses NodeRepo for CRUD operations on NodeEntity.
 */

@Service
@AllArgsConstructor
public class NodeServiceImpl implements NodeService {
    @Autowired
    NodeStudentRepo Studentrepo;

    @Autowired
    NodeContactRepo  NodeContactrepo;

    @Autowired
    NodeBlogRepo NodeBlogRepo;
    @Override
    public NodeStudentEntity createNode(NodeStudentEntity Studentnode) {
        NodeStudentEntity student =new NodeStudentEntity();
        student.setFirstName(Studentnode.getFirstName());
        student.setLastName(Studentnode.getLastName());

        NodeContactEntity contact =new NodeContactEntity();
        contact.setEmail(Studentnode.getContact().getEmail());
        contact.setPhone_number(Studentnode.getContact().getPhone_number());
        contact.setStudent(student);
        student.setContact(contact);

        List<NodeBlogEntity> blogs = new ArrayList<>();
        Studentnode.getBlog().forEach(item ->{
            NodeBlogEntity blogEntity=new NodeBlogEntity();
            blogEntity.setBlogDetails(item.getBlogDetails());
            blogEntity.setStudent(student);
            blogs.add(blogEntity);
        });

//        blogs.forEach(item -> {
//            item.setStudent(student);
//        });
        student.setBlog(blogs);


       // blog.setBlogDetails(Studentnode.getBlog().getblogDetails);

         //student.setBlog(blogs);

        //NodeContactrepo.save(contact);
        Studentrepo.save(student);
        return Studentnode;
    }
}

