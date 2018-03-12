package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model {


@Constraints.Required
private String projectName;

@Id
private Long id;

@ManyToMany(cascade = CascadeType.ALL)
private List<Project> projects;


public Project (){

}

public Project(String projectName, Long id, List<Project> projects) {
    this.projectName = projectName;
    this.id = id;
    this.projects = projects;
}



public Long getId(){
    return id;
}

public void setId(){
    this.id = id;
}


public List<Project> getProject() {
    return projects;
}

public void setProject(List<Project> projects) {
    this.projects = projects;
}


public String getProjectName(){
    return projectName;
}

public void setProjectName(String projectName){
    this.projectName = projectName;
}


public static final Finder<Long, Project> find = new Finder<>(Project.class);

public static final List<Project> findAll() {
    return Project.find.all();
}
public static Map<String,String> options(){
    LinkedHashMap<String,String> options = new LinkedHashMap<>();
    
    for(Project p: Project.findAll()){
        options.put(p.getId().toString(),p.getProjectName());
    }
    return options;
    
    
    }
 

}

 

