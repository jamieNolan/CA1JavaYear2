
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[models.Employee],List[models.Department],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.5*/(employee: List[models.Employee],department: List[models.Department],project: List[models.Project], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.156*/("""
    """),_display_(/*3.6*/main("Employee", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""  

    """),format.raw/*5.5*/("""<p class="lead">Employee List</p>
    <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <div class="list-group">

        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.about(0)),format.raw/*11.49*/("""" class="list-group-item">All categories</a>
        """),_display_(/*12.10*/for(d <- department) yield /*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
          """),format.raw/*13.11*/("""<a href=""""),_display_(/*13.21*/routes/*13.27*/.HomeController.about(d.getId)),format.raw/*13.57*/("""" class="list-group-item">"""),_display_(/*13.84*/d/*13.85*/.getName),format.raw/*13.93*/("""
              """),format.raw/*14.15*/("""<span class="badge">"""),_display_(/*14.36*/d/*14.37*/.getEmployee.size()),format.raw/*14.56*/("""</span>
          </a>
        """)))}),format.raw/*16.10*/("""


    
    """),format.raw/*20.5*/("""</div>
  </div>
  </div>
        <div class="col-sm-10">

       
    """),_display_(/*26.6*/if(flash.containsKey("success"))/*26.38*/{_display_(Seq[Any](format.raw/*26.39*/("""

    """),format.raw/*28.5*/("""<div class="alert alert-success">
      """),_display_(/*29.8*/flash/*29.13*/.get("success")),format.raw/*29.28*/("""
    """),format.raw/*30.5*/("""</div>
  """)))}),format.raw/*31.4*/("""
    """),format.raw/*32.5*/("""<table class="table table-bordered table-hover table-condensed">
    
    <thead>
    
    <!-- The header row-->
    
    <tr>

    <th>Image</th>  

    <th>ID</th>
    
    <th>Department</th>
    
    <th>Address</th>

    <th>Name</th>
    
    <th>Project</th>

    
    <th>Delete</th>

    <th>Update</th>
    
    
    </tr>
    
    </thead>
    
    <tbody>
    
    """),_display_(/*64.6*/for(e<-employee) yield /*64.22*/ {_display_(Seq[Any](format.raw/*64.24*/("""
    """),format.raw/*65.5*/("""<tr>
        """),_display_(/*66.10*/if(env.resource("public/images/Images/" + e.getId + ".jpg").isDefined)/*66.80*/ {_display_(Seq[Any](format.raw/*66.82*/("""
         """),format.raw/*67.10*/("""<td><img src="/assets/images/Images/"""),_display_(/*67.47*/(e.getId + ".jpg")),format.raw/*67.65*/(""""/></td>
      """)))}/*68.9*/else/*68.14*/{_display_(Seq[Any](format.raw/*68.15*/("""
          """),format.raw/*69.11*/("""<td><img src="/assets/images/Images/noImage.jpg"/></td>
      """)))}),format.raw/*70.8*/("""

    
    """),format.raw/*73.5*/("""<td>"""),_display_(/*73.10*/e/*73.11*/.getId),format.raw/*73.17*/("""</td>

    <td>"""),_display_(/*75.10*/e/*75.11*/.getDepartment),format.raw/*75.25*/("""</td>
    
    <td>"""),_display_(/*77.10*/e/*77.11*/.getAddress),format.raw/*77.22*/("""</td>
    
    <td>"""),_display_(/*79.10*/e/*79.11*/.getName),format.raw/*79.19*/("""</td>

    <td>"""),_display_(/*81.10*/e/*81.11*/.getProject),format.raw/*81.22*/("""</td>


    <td>
      <a href=""""),_display_(/*85.17*/routes/*85.23*/.HomeController.deleteEmployee(e.getId)),format.raw/*85.62*/("""" class="button-xs btn-danger">
        <button class="btn btn-primary">Delete an Employee</button>
      </a>
    
    </td>
    <td>     
       <a href=""""),_display_(/*91.18*/routes/*91.24*/.HomeController.updateEmployee(e.getId)),format.raw/*91.63*/("""" class="button-xs btn-danger">
      <button class="btn btn-primary">Update an Employee</button>
      </a>
</td>
    
    </tr>
  </tbody>
  
  """)))}),format.raw/*99.4*/("""
    
    
    """),format.raw/*102.5*/("""</table>
    <p>
      <a href=""""),_display_(/*104.17*/routes/*104.23*/.HomeController.addEmployee()),format.raw/*104.52*/("""">
        <button class="btn btn-primary">Add an Employee</button>
      </a>
    </p>
  
    
  </div>
    
    """)))}),format.raw/*112.6*/("""
  """))
      }
    }
  }

  def render(employee:List[models.Employee],department:List[models.Department],project:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employee,department,project,user,env)

  def f:((List[models.Employee],List[models.Department],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employee,department,project,user,env) => apply(employee,department,project,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/about.scala.html
                  HASH: 9edafad1c9cd0019f0e8ec4b3e9356552ffda873
                  MATRIX: 1047->8|1294->159|1325->165|1355->187|1394->189|1428->197|1614->356|1629->362|1674->386|1755->440|1791->460|1831->462|1870->473|1907->483|1922->489|1973->519|2027->546|2037->547|2066->555|2109->570|2157->591|2167->592|2207->611|2270->643|2309->655|2406->726|2447->758|2486->759|2519->765|2586->806|2600->811|2636->826|2668->831|2708->841|2740->846|3145->1225|3177->1241|3217->1243|3249->1248|3290->1262|3369->1332|3409->1334|3447->1344|3511->1381|3550->1399|3584->1416|3597->1421|3636->1422|3675->1433|3768->1496|3806->1507|3838->1512|3848->1513|3875->1519|3918->1535|3928->1536|3963->1550|4010->1570|4020->1571|4052->1582|4099->1602|4109->1603|4138->1611|4181->1627|4191->1628|4223->1639|4283->1672|4298->1678|4358->1717|4542->1874|4557->1880|4617->1919|4794->2066|4837->2081|4898->2114|4914->2120|4965->2149|5111->2264
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|47->16|51->20|57->26|57->26|57->26|59->28|60->29|60->29|60->29|61->30|62->31|63->32|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|104->73|104->73|104->73|104->73|106->75|106->75|106->75|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|116->85|116->85|116->85|122->91|122->91|122->91|130->99|133->102|135->104|135->104|135->104|143->112
                  -- GENERATED --
              */
          