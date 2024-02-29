package edu.ucalgary.oop;
interface IToDoList {

	default public void addTask(Task task){

    }
	
	default public void completeTask(String id){

    }
	
	default public void deleteTask(String id){

    }
	
	default void editTask(String id, String title, boolean isComplete){

    }
	
	default void undo(){
		
	}
	
	default void listTasks(){

    }
}
	