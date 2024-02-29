package edu.ucalgary.oop;

import java.util.Objects;

interface IToDoList {

	default public void addTask(Task task){
        boolean exists = false;
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
	
	default public void completeTask(String id){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setIsCompleted(true);
                i = taskList.size();
            }
        }
    }
	
	default public void deleteTask(String id){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.remove(i)
                i = taskList.size();
            }
        }
    }
	
	default void editTask(String id, String title, boolean isComplete){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setTitle(title);
                taskList.get(i).setIsComplete(isComplete);
            }
        }
    }
	
	default void undoTask(){
		
	}
	
	default void listTasks(){
        for(int i = 0; i < taskList.size();i++){
            System.out.println("Id: ", taskList.get(i).getId(), " Title: ",taskList.get(i).getTitle()," isComplete: ",taskList.get(i).getIsComplete());
        }
    }
	
}