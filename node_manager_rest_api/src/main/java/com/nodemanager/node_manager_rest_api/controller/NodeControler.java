package com.nodemanager.node_manager_rest_api.controller;
import com.nodemanager.node_manager_rest_api.entity.NodeContactEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nodemanager.node_manager_rest_api.entity.NodeStudentEntity;
import com.nodemanager.node_manager_rest_api.service.NodeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController annotation makes it a mvc controller
@AllArgsConstructor
@RestController
@RequestMapping("/blog")
public class NodeControler {
    public NodeService NodeService;

    @PostMapping("/postdata")
    ResponseEntity<NodeStudentEntity> postStudent(@RequestBody NodeStudentEntity student){
        Logger logger =LoggerFactory.getLogger(NodeControler.class);
        NodeStudentEntity node= NodeService.createNode( student);
        logger.info("Logging MyObject: {}",student);
        return ResponseEntity.status(HttpStatus.OK)
               .body(node);
    }

    @PutMapping("/putdata")
    ResponseEntity<NodeStudentEntity> putStudent(@RequestBody NodeStudentEntity student){
        Logger logger =LoggerFactory.getLogger(NodeControler.class);
        NodeStudentEntity node= NodeService.updateBlog( student);
        logger.info("Logging MyObject: {}",student);
        return ResponseEntity.status(HttpStatus.OK)
                .body(node);
    }

}
