package com.example.proplanner.Controllers;

import com.example.proplanner.Model.Entities.Task;
import com.example.proplanner.Model.Services.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskDAO taskDAO;

    @GetMapping("/tasks/get-all")
    public List<Task> getAllTasks(){
        return taskDAO.getAllTasks();
    }

    @GetMapping("/tasks/get-tasks-by-listid/{listid}")
    public List<Task> getTasksByListID(@PathVariable int listid){
        return taskDAO.getAllTasksByListID(listid);
    }

    @GetMapping("/tasks/get-tasks-by-date/{taskDate}")
    public List<Task> getTasksByDate(@PathVariable String taskDate){
        return taskDAO.getTasksByDate(taskDate);
    }

    @PostMapping("/tasks/add-new-task")
    public Task addNewTask(@RequestBody Task newTask){
        return taskDAO.addTask(newTask);
    }

    //edit task by task id
    @PutMapping("/tasks/edit-task/{taskid}")
    public void editTask(@PathVariable int taskid, @RequestBody Task task){

    }

    //delete task
    @DeleteMapping ("/tasks/delete/{taskid}")
    public void deleteTask(@PathVariable int taskid){
        taskDAO.deleteTask(taskid);
    }
}
