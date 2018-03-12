
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.Employee
/*2.2*/import models.users.User
/*3.2*/import models.Department;
/*4.2*/import models.Project;

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Employee],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(employeeForm: Form[Employee],user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._


Seq[Any](format.raw/*7.43*/("""
"""),format.raw/*9.1*/("""

"""),_display_(/*11.2*/main("Add Employee", user)/*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
    """),format.raw/*12.5*/("""<p class#"lead">Add a new Employee</p>

    """),_display_(/*14.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*17.39*/ {_display_(Seq[Any](format.raw/*17.41*/("""


    """),_display_(/*20.6*/CSRF/*20.10*/.formField),format.raw/*20.20*/("""

    """),_display_(/*22.6*/inputText(employeeForm("id"), '_label -> "id", 'class -> "form-control")),format.raw/*22.78*/("""
    """),_display_(/*23.6*/select(

                employeeForm("Department.id"),options(Department.options),'_label ->"Department",'_default -> "--Choose department please--",
                '_showConstraints -> false, 'class-> "form-control"

            )),format.raw/*28.14*/("""
    """),_display_(/*29.6*/select(
                
                employeeForm("Address.id"),options(Address.options),'_label ->"Address",'_default -> "--Choose Address please--",
                 '_showConstraints -> false, 'class-> "form-control"
                
    )),format.raw/*34.6*/("""
    """),_display_(/*35.6*/inputText(employeeForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*35.82*/("""


    """),_display_(/*38.6*/for((value, name) <- Project.options) yield /*38.43*/ {_display_(Seq[Any](format.raw/*38.45*/("""
        """),format.raw/*39.9*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*39.60*/value),format.raw/*39.65*/(""""
        
        />"""),_display_(/*41.12*/name),format.raw/*41.16*/("""<br>        
    """)))}),format.raw/*42.6*/("""


            """),_display_(/*45.14*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*45.79*/("""


            """),format.raw/*48.13*/("""<label>Image Upload</label> 
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br> 
    <div class="actions">
        <input type="submit" value="Add/Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*53.19*/routes/*53.25*/.HomeController.about(0)),format.raw/*53.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*57.2*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[Employee],user:User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[Employee],User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/addEmployee.scala.html
                  HASH: 6bb4cd6a75b489901dc5f4bdaeebe9345b5199db
                  MATRIX: 651->1|681->25|713->51|746->78|1092->104|1206->147|1251->145|1278->163|1307->166|1342->192|1381->193|1413->198|1484->243|1642->392|1682->394|1716->402|1729->406|1760->416|1793->423|1886->495|1918->501|2172->734|2204->740|2470->986|2502->992|2599->1068|2633->1076|2686->1113|2726->1115|2762->1124|2840->1175|2866->1180|2915->1202|2940->1206|2988->1224|3031->1240|3117->1305|3160->1320|3421->1554|3436->1560|3481->1584|3613->1686
                  LINES: 24->1|25->2|26->3|27->4|32->7|35->8|38->7|39->9|41->11|41->11|41->11|42->12|44->14|47->17|47->17|50->20|50->20|50->20|52->22|52->22|53->23|58->28|59->29|64->34|65->35|65->35|68->38|68->38|68->38|69->39|69->39|69->39|71->41|71->41|72->42|75->45|75->45|78->48|83->53|83->53|83->53|87->57
                  -- GENERATED --
              */
          