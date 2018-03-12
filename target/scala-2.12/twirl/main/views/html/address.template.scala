
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

object address extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(address: List[models.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""
"""),_display_(/*2.2*/main("Address", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""  
"""),format.raw/*3.1*/("""<p class="lead">Address List</p>

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

<th>Address</th>


</tr>

</thead>

<tbody>

<!-- Product row(s) -->
"""),_display_(/*31.2*/for(a<-address) yield /*31.17*/ {_display_(Seq[Any](format.raw/*31.19*/("""
"""),format.raw/*32.1*/("""<tr>

<td>"""),_display_(/*34.6*/a/*34.7*/.getId),format.raw/*34.13*/("""</td>

<td>"""),_display_(/*36.6*/a/*36.7*/.getAddress),format.raw/*36.18*/("""</td>



</tr>
""")))}),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""</tbody>

</table>


""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(address:List[models.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(address,user,env)

  def f:((List[models.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (address,user,env) => apply(address,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/address.scala.html
                  HASH: f06c0531211c69cca0555a06f04f80b9947c7daa
                  MATRIX: 1003->1|1181->84|1208->86|1237->107|1275->108|1304->111|1364->146|1404->178|1442->179|1470->181|1532->218|1544->223|1579->238|1606->239|1644->247|1672->248|1886->436|1917->451|1957->453|1985->454|2022->465|2031->466|2058->472|2096->484|2105->485|2137->496|2183->512|2212->514|2264->536
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|39->7|40->8|40->8|40->8|41->9|42->10|43->11|63->31|63->31|63->31|64->32|66->34|66->34|66->34|68->36|68->36|68->36|73->41|75->43|80->48
                  -- GENERATED --
              */
          