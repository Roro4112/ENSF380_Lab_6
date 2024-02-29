package edu.ucalgary.oop;
import java.util.List;
import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> taskList;
	private Stack<List<Task>> stack;
	
	@Override
    public void addTask(Task task){
        boolean exists = false;
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if (task.getId() == taskList.get(i).getId()){
                exists = true;
                i = taskList.size();
            } 
        }
        if (exists == false){
            taskList.add(task);
        }
    }
	
	@Override
    public void completeTask(String id){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setCompleted(true);
                i = taskList.size();
            }
        }
    }
	
	@Override
    public void deleteTask(String id){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.remove(i);
                i = taskList.size();
            }
        }
    }
	
	@Override
    public void editTask(String id, String title, boolean isComplete){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setTitle(title);
                taskList.get(i).setCompleted(isComplete);
            }
        }
    }
	
	@Override
    public void undo(){
		taskList = stack.pop();
    }
	
	@Override
    public void listTasks(){
        for(int i = 0; i < taskList.size();i++){
            System.out.println("Id: " + taskList.get(i).getId() + " Title: " + taskList.get(i).getTitle() + " isComplete: " + taskList.get(i).getCompleted());
        }
    }
}

