package com.app.Progress_tracker.services;

import com.app.Progress_tracker.models.Task;
import com.app.Progress_tracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){

        return taskRepository.findAll();

    }

    public void CreateTasks(String title) {

        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTasks(long id) {

        taskRepository.deleteById(id);

    }

    public void toggleTasks(long id) {
        Task task;
        task = taskRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Not a valid task id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
