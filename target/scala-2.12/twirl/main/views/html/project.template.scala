
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: List[models.Project], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""
"""),_display_(/*2.2*/main("Project", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""  
"""),format.raw/*3.1*/("""<p class="lead">Project List</p>

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

<th>Project</th>


</tr>

</thead>

<tbody>

"""),_display_(/*30.2*/for(p<-project) yield /*30.17*/ {_display_(Seq[Any](format.raw/*30.19*/("""
"""),format.raw/*31.1*/("""<tr>

<td>"""),_display_(/*33.6*/p/*33.7*/.getId),format.raw/*33.13*/("""</td>

<td>"""),_display_(/*35.6*/p/*35.7*/.getProjectName),format.raw/*35.22*/("""</td>



</tr>
""")))}),format.raw/*40.2*/("""

"""),format.raw/*42.1*/("""</tbody>

</table>


""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(project:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(project,user,env)

  def f:((List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (project,user,env) => apply(project,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/project.scala.html
                  HASH: e63965d852f1918892b14daa644f1a8019004f59
                  MATRIX: 1003->1|1181->84|1208->86|1237->107|1275->108|1304->111|1364->146|1404->178|1442->179|1470->181|1532->218|1544->223|1579->238|1606->239|1644->247|1672->248|1862->412|1893->427|1933->429|1961->430|1998->441|2007->442|2034->448|2072->460|2081->461|2117->476|2163->492|2192->494|2244->516
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|39->7|40->8|40->8|40->8|41->9|42->10|43->11|62->30|62->30|62->30|63->31|65->33|65->33|65->33|67->35|67->35|67->35|72->40|74->42|79->47
                  -- GENERATED --
              */
          