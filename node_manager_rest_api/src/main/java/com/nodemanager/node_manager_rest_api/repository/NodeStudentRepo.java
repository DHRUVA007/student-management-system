package com.nodemanager.node_manager_rest_api.repository;
//generate jpa repository

import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface NodeStudentRepo extends CrudRepository<NodeStudentEntity,Long> {

}
