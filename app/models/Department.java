package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model {

@Constraints.Required
private String name;
                                       
@Id
private Long id;

@OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
private List<Employee> employee;


public Department (){

}

public Department(Long id, String name, List<Employee> employee) {
    this.name=name;
    this.id = id;
    this.employee = employee;
}



public String getName() {
    
    return name;
    }
public void setName(String name) {
    
    this.name = name;
    
    }

public Long getId(){
    return id;
}

public void setId(){
    this.id = id;
}


public List<Employee> getEmployee() {
    return employee;
}

public void setEmployee(List<Employee> employee) {
    this.employee = employee;
}


public static Finder<Long, Department> find = new Finder<Long, Department>(Department.class);

public static List<Department> findAll() {
    return Department.find.all();
}


public static Map<String,String> options(){
    LinkedHashMap<String,String> options = new LinkedHashMap<>();
    
    for(Department d: Department.findAll()){
        options.put(d.getId().toString(),d.getName());
    }
    return options;
    
    
    }
 

}
