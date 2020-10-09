package demo

import org.scalajs.dom
import slinky.web.ReactDOM

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("./node_modules/bulma/css/bulma.css", JSImport.Namespace)
@js.native
object BulmaCss extends js.Object

object Main {
  def main(args: Array[String]): Unit = {
    /* touch to load */
    BulmaCss

    ReactDOM.render(App(), dom.document.getElementById("container"))
  }
}
