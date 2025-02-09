package com.nodemanager.node_manager_rest_api.controller;
import com.nodemanager.node_manager_rest_api.entity.NodeContactEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;
import com.nodemanager.node_manager_rest_api.service.NodeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController annotation makes it a mvc controller
@AllArgsConstructor
@RestController
@RequestMapping("/blog")
public class NodeControler {
    public NodeService NodeService;
    @PostMapping("/postdata")
    ResponseEntity<NodeStudentEntity> postStudent(@RequestBody NodeStudentEntity NodeStudentEntity1){
//        NodeStudentEntity n=NodeStudentEntity1;
//        NodeStudentEntity1.getContact().setStudent(n);
        Logger logger =LoggerFactory.getLogger(NodeControler.class);
        NodeStudentEntity node= NodeService.createNode( NodeStudentEntity1);
        logger.info("Logging MyObject: {}",NodeStudentEntity1);
        return ResponseEntity.status(HttpStatus.OK)
               .body(node);
    }

}
