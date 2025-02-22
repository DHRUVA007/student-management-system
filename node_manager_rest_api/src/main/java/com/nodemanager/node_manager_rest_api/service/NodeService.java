package com.nodemanager.node_manager_rest_api.service;

import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;

public interface NodeService {
   NodeStudentEntity createNode(NodeStudentEntity node);
   NodeStudentEntity login(NodeStudentEntity node);

}
