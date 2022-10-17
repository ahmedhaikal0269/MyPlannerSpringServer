package com.example.proplanner.Model.Services;

import com.example.proplanner.Model.Entities.Task;
import com.example.proplanner.Model.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskDAO {

    @Autowired
    TaskRepository taskRepository;

    //================== get tasks ===================//

    //get all tasks
    public List<Task> getAllTasks(){
        List<Task> allTasks = new ArrayList<>();
        Streamable.of(taskRepository.findAll()).forEach(allTasks::add);
        return allTasks;
    }

    //get tasks by list ID
    public List<Task> getAllTasksByListID(int listID){
        return taskRepository.getAllTasksByUserId(listID);
    }

    //get tasks by date
    public List<Task> getTasksByDate(String date){
        return taskRepository.getAllTasksByDate(date);
    }

    // add a new task
    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTask(int taskID){
        taskRepository.delete(taskRepository.getReferenceById(taskID));
    }
}
