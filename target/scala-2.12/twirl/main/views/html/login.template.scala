
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],  user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<div class="col-xs-4">
        <h3>Sign In</h3>
        """),_display_(/*7.10*/if(loginForm.hasGlobalErrors)/*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
            """),format.raw/*8.13*/("""<p class="alert alert-warning">
                """),_display_(/*9.18*/loginForm/*9.27*/.globalError.message),format.raw/*9.47*/("""
                """),format.raw/*10.17*/("""</p>
        """)))}),format.raw/*11.10*/("""
        """),_display_(/*12.10*/if(flash.containsKey("error"))/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
            """),format.raw/*13.13*/("""<p class="alert alert-warning">
                """),_display_(/*14.18*/flash/*14.23*/.get("loginRequired")),format.raw/*14.44*/("""
            """),format.raw/*15.13*/("""</p>
        """)))}),format.raw/*16.10*/("""
        """),_display_(/*17.10*/helper/*17.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*17.80*/ {_display_(Seq[Any](format.raw/*17.82*/("""
            """),_display_(/*18.14*/CSRF/*18.18*/.formField),format.raw/*18.28*/("""

            """),format.raw/*20.13*/("""<div class="form-group">
                """),_display_(/*21.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "from-control input-xs", 'placeholder -> "Email")),format.raw/*22.76*/("""
            """),format.raw/*23.13*/("""</div>
            <div class="form-group">
                    """),_display_(/*25.22*/inputText(loginForm("password"), '_label -> "",
                    'class -> "from-control input-xs", 'placeholder -> "password")),format.raw/*26.83*/("""
                """),format.raw/*27.17*/("""</div>
                <div class="form-group">
                    <input type="submit" value="Sign In" class="btn btn-primary">
                    
                </div>
        """)))}),format.raw/*32.10*/("""

    """),format.raw/*34.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:27:15 GMT 2018
                  SOURCE: /media/sf_student/Ca1/app/views/login.scala.html
                  HASH: 0aae7cc19ecfff0bee6815fd426066ce94e50507
                  MATRIX: 984->1|1120->66|1165->64|1192->82|1219->84|1246->103|1285->105|1316->110|1399->167|1436->196|1475->198|1515->211|1590->260|1607->269|1647->289|1692->306|1737->320|1774->330|1813->360|1853->362|1894->375|1970->424|1984->429|2026->450|2067->463|2112->477|2149->487|2164->493|2237->557|2277->559|2318->573|2331->577|2362->587|2404->601|2473->643|2614->763|2655->776|2747->841|2898->971|2943->988|3157->1171|3190->1177
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|52->20|53->21|54->22|55->23|57->25|58->26|59->27|64->32|66->34
                  -- GENERATED --
              */
          