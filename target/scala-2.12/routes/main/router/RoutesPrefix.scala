
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/Ca1/conf/routes
// @DATE:Mon Mar 12 03:27:14 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
