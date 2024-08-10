package com.project.todolist.controller;

import com.project.todolist.model.Task;
import com.project.todolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        logger.info("Received task for creation: Title={}, Description={}, Completed={}",
            task.getTitle(), task.getDescription(), task.isCompleted());
        return taskService.save(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.delete(id);
    }
}
