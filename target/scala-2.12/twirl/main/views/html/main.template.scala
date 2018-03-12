
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
 
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            
      </head>                      
        
                   <body> 
                      <nav class="navbar navbar-default" role="navigation">
                        <div class="container-fluid">
                          <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                              <span class="sr-only">Toggle navigation</span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href=""""),_display_(/*24.60*/routes/*24.66*/.HomeController.about()),format.raw/*24.89*/("""">Java Co</a>
                          </div>
                          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                              <li><a href=""""),_display_(/*28.45*/routes/*28.51*/.HomeController.about()),format.raw/*28.74*/("""">Employee List<span class="sr-only">(current)</span></a></li>
                              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Information<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                  <li><a href=""""),_display_(/*31.49*/routes/*31.55*/.HomeController.project()),format.raw/*31.80*/("""">Projects</a></li>
                                  <li><a href=""""),_display_(/*32.49*/routes/*32.55*/.HomeController.department()),format.raw/*32.83*/("""">Departments</a></li>
                                  <li><a href=""""),_display_(/*33.49*/routes/*33.55*/.HomeController.address()),format.raw/*33.80*/("""">Address</a></li>
                                  <li """),_display_(/*34.40*/if(title == "Login")/*34.60*/{_display_(Seq[Any](format.raw/*34.61*/("""class="active"""")))}),format.raw/*34.76*/(""">
                                       """),_display_(/*35.41*/if(user != null)/*35.57*/ {_display_(Seq[Any](format.raw/*35.59*/("""
                                         """),format.raw/*36.42*/("""<a href=""""),_display_(/*36.52*/routes/*36.58*/.LoginController.logout()),format.raw/*36.83*/("""">Logout """),_display_(/*36.93*/user/*36.97*/.getName()),format.raw/*36.107*/("""</a>
                                       """)))}/*37.42*/else/*37.47*/{_display_(Seq[Any](format.raw/*37.48*/("""
                                         """),format.raw/*38.42*/("""<a href=""""),_display_(/*38.52*/routes/*38.58*/.LoginController.login()),format.raw/*38.82*/("""">Login</a>
                                       """)))}),format.raw/*39.41*/("""
                                  """),format.raw/*40.35*/("""</li>
                                </ul>
                              </li>
                            </ul>
                                                                                              </div>
                                                                      </div>
                      </nav>
                      </body>


















        """),format.raw/*67.32*/("""
        """),_display_(/*68.10*/content),format.raw/*68.17*/("""

        """),format.raw/*70.9*/("""<script src=""""),_display_(/*70.23*/routes/*70.29*/.Assets.versioned("javascripts/main.js")),format.raw/*70.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/main.scala.html
                  HASH: a99bd7baa68ba3d49450cf1af5159cf564b3a630
                  MATRIX: 970->2|1120->57|1149->60|1228->165|1263->174|1297->182|1322->187|2440->1278|2455->1284|2499->1307|2772->1553|2787->1559|2831->1582|3181->1905|3196->1911|3242->1936|3337->2004|3352->2010|3401->2038|3499->2109|3514->2115|3560->2140|3645->2198|3674->2218|3713->2219|3759->2234|3828->2276|3853->2292|3893->2294|3963->2336|4000->2346|4015->2352|4061->2377|4098->2387|4111->2391|4143->2401|4207->2447|4220->2452|4259->2453|4329->2495|4366->2505|4381->2511|4426->2535|4509->2587|4572->2622|4977->3089|5014->3099|5042->3106|5079->3116|5120->3130|5135->3136|5196->3176
                  LINES: 28->1|33->1|35->3|38->6|39->7|39->7|39->7|56->24|56->24|56->24|60->28|60->28|60->28|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|72->40|98->67|99->68|99->68|101->70|101->70|101->70|101->70
                  -- GENERATED --
              */
          