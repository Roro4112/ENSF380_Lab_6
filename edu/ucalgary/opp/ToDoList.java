package edu.ucalgary.opp;
import java.util.List;
import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> taskList;
	private Stack<List<Task>> stack;
	
	
	@override
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
	@override
    public void completeTask(String id){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setIsCompleted(true);
                i = taskList.size();
            }
        }
    }
	@override
    public void deleteTask(String id){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.remove(i)
                i = taskList.size();
            }
        }
    }
	@override
    public void editTask(String id, String title, boolean isComplete){
		stack.push(taskList);
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setTitle(title);
                taskList.get(i).setIsComplete(isComplete);
            }
        }
    }
	@override
    public void undo(){
		taskList = stack.pop();
		
    }
	@override
    public void listTasks(){
        for(int i = 0; i < taskList.size();i++){
            System.out.println("Id: ", taskList.get(i).getId(), " Title: ",taskList.get(i).getTitle()," isComplete: ",taskList.get(i).getIsComplete());
        }
    }
}


