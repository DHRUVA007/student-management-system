package com.nodemanager.node_manager_rest_api.repository;

import com.nodemanager.node_manager_rest_api.entity.NodeContactEntity;
import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface NodeContactRepo extends CrudRepository<NodeContactEntity,Long> {
}
