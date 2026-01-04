package com.app.Progress_tracker.repository;

import com.app.Progress_tracker.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
