
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Department],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(department: List[models.Department], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""
"""),_display_(/*2.2*/main("Department", user)/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""  
"""),format.raw/*3.1*/("""<p class="lead">Department List</p>

"""),_display_(/*5.2*/if(flash.containsKey("success"))/*5.34*/{_display_(Seq[Any](format.raw/*5.35*/("""

"""),format.raw/*7.1*/("""<div class="alert alert-success">
  """),_display_(/*8.4*/flash/*8.9*/.get("success")),format.raw/*8.24*/("""
"""),format.raw/*9.1*/("""</div>
""")))}),format.raw/*10.2*/("""
"""),format.raw/*11.1*/("""<table class="table table-bordered table-hover table-condensed">

<thead>

<!-- The header row-->

<tr>

<th>ID</th>

<th>Department</th>


</tr>

</thead>

<tbody>

<!-- Product row(s) -->
"""),_display_(/*31.2*/for(d<-department) yield /*31.20*/ {_display_(Seq[Any](format.raw/*31.22*/("""
"""),format.raw/*32.1*/("""<tr>

  <td>"""),_display_(/*34.8*/d/*34.9*/.getId),format.raw/*34.15*/("""</td>
  
<td>"""),_display_(/*36.6*/d/*36.7*/.getName),format.raw/*36.15*/("""</td>



</tr>
""")))}),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""</tbody>

</table>


""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(department:List[models.Department],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(department,user,env)

  def f:((List[models.Department],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (department,user,env) => apply(department,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/department.scala.html
                  HASH: 61c9966ee652b5904005083288279072ca8a7f3d
                  MATRIX: 1009->1|1193->90|1220->92|1252->116|1290->117|1319->120|1382->158|1422->190|1460->191|1488->193|1550->230|1562->235|1597->250|1624->251|1662->259|1690->260|1907->451|1941->469|1981->471|2009->472|2048->485|2057->486|2084->492|2124->506|2133->507|2162->515|2208->531|2237->533|2289->555
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|39->7|40->8|40->8|40->8|41->9|42->10|43->11|63->31|63->31|63->31|64->32|66->34|66->34|66->34|68->36|68->36|68->36|73->41|75->43|80->48
                  -- GENERATED --
              */
          