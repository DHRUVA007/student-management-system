package com.nodemanager.node_manager_rest_api.repository;

import com.nodemanager.node_manager_rest_api.entity.NodeBlogEntity;
import org.springframework.data.repository.CrudRepository;

public interface NodeBlogRepo extends CrudRepository<NodeBlogEntity,Long> {
}
