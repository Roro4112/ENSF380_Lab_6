package edu.ucalgary.opp;
import java.util.List;

public class ToDoList{
    private List<Task> taskList;
    public void addTask(Task task){
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
    public void completeTask(String id){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setIsCompleted(true);
                i = taskList.size();
            }
        }
    }
    public void deleteTask(String id){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.remove(i)
                i = taskList.size();
            }
        }
    }
    public void editTask(String id, String title, boolean isComplete){
        for(int i = 0; i < taskList.size();i++){
            if(taskList.get(i).getId().equals(id)){
                taskList.get(i).setTitle(title);
                taskList.get(i).setIsComplete(isComplete);
            }
        }
    }
    public void undo(){

    }
    public void listTasks(){
        for(int i = 0; i < taskList.size();i++){
            System.out.println("Id: ", taskList.get(i).getId(), " Title: ",taskList.get(i).getTitle()," isComplete: ",taskList.get(i).getIsComplete());
        }
    }
}


