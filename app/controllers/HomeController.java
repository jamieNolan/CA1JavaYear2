package controllers;

import play.mvc.*;
import views.html.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import models.*;
import models.users.*;

import views.html.*;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


public class HomeController extends Controller {
    private FormFactory formFactory;
    private Environment e;

    @Inject 
    public HomeController(FormFactory f,Environment env){
        this.formFactory = f;
        this.e = env;
        
    }



    public Result about(Long department){
        List<Employee> employeeList = Employee.findAll();
        List<Department> departmentList = Department.findAll();
        List<Project> projectList = Project.findAll();
        
        if (department == 0) {
            employeeList = Employee.findAll();
        } else {
            employeeList = Department.find.ref(department).getEmployee();
        }
        

        

        return ok(about.render(employeeList, departmentList, projectList, User.getUserById(session().get("email")),e));
    }


    public Result department(){
        List<Department> departmentList = Department.findAll();
        return ok(department.render(departmentList, User.getUserById(session().get("email")),e));
    }

    public Result project(){
        List<Project> projectList = Project.findAll();
        return ok(project.render(projectList, User.getUserById(session().get("email")),e));
    }

   


    public Result address(){
        List<Address> addressList = Address.findAll();
        return ok(address.render(addressList, User.getUserById(session().get("email")),e));
    }

    @Security.Authenticated(Secured.class)
    @With(AdminController.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit(){
        Employee newEmployee;
        String saveImageMsg;
        
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm, User.getUserById(session().get("email"))));

        } else {
            newEmployee = newEmployeeForm.get();
            
            if(newEmployee.getId() == null) {
                newEmployee.save();
                
            } else if(newEmployee.getId() != null) {
                newEmployee.save();                
            }
            newEmployee.save();

            flash("success", "Employee "+newEmployee.getId() + "was added");

        }
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        saveImageMsg = saveFile(newEmployee.getId(), image);

        flash("success", "Employee " + newEmployee.getName() + " has been created " + saveImageMsg);

        return redirect(controllers.routes.HomeController.about(0));
    }

    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

        return redirect(routes.HomeController.about(0));
    }

    @Transactional
    public Result updateEmployee(Long id) {
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(id);

            employeeForm = formFactory.form(Employee.class).fill(e);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }


    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();                
                File file = uploaded.getFile();
                IMOperation op = new IMOperation();
                op.addImage(file.getAbsolutePath());
                op.resize(300, 200);
                op.addImage("public/images/productImages/" + id + ".jpg");
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }

}
