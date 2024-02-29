package edu.ucalgary.oop;

import java.util.Objects;

public class Task {

private String Id;
private String title;
private boolean isCompleted;

// Task constructor 
public Task(String Id, String title, boolean isCompleted){
    this.Id = Id;
    this.title = title;
    this.isCompleted = isCompleted;}

// Task constructor 
public Task(String Id, String title){
    this.Id = Id;
    this.title = title;
}


 //setters
public void setTitle(String title) {
        this.title = title;
}    

public void setId(String Id) {
    this.Id = Id;
}

//getters
public String getId() {
    return Id;
}
public String getTitle() {
    return title;
}

public boolean getcompleted(){
    return isCompleted;
}



public boolean isCompleted() {
    return isCompleted;
}
public void setCompleted(boolean completed) {
    isCompleted = completed;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Task task = (Task) obj;
    return Objects.equals(Id, task.Id) &&
           Objects.equals(title, task.title) &&
           isCompleted == task.isCompleted;
}

@Override
public int hashCode() {
    return Objects.hash(Id, title, isCompleted);
}

public Task copy() {
    Task copiedTask = new Task(this.Id, this.title, this.isCompleted);
    copiedTask.setCompleted(this.isCompleted);
    return copiedTask;
}
}