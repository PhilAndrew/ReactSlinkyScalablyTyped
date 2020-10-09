package demo

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html.{className, div, h1, h2, h3, h4, p, section}
import typings.leaflet.mod.LatLngExpression
import typings.reactLeaflet.components.{Map, Marker, Popup, TileLayer}
import typings.reactLeaflet.mod.{MapProps, MarkerProps, PopupProps, TileLayerProps}

import scala.language.implicitConversions
import scala.scalajs.js
import typings.reactMonacoEditor.components._
import typings.reactMonacoEditor.typesMod.MonacoEditorProps

@react object App {
  type Props = Unit

  val component = FunctionalComponent[Props] { _ =>
    val position: LatLngExpression = js.Tuple2(51.505, -0.09)

    section(className := "section",
      div(className := "container is-fluid",
        div(className := "columns",
          div(className := "column",
            h2("Ribbon"),
            ReactMonacoEditor.height("500")
              .theme("vs-dark")
              .language("")
              .value(
                """average of str is string to double
                  |cast total length / cast num words
                  |total length is sum of all lengths of words of str
                  |num words is word count of str
                  |
                  |word count of str is string to nat
                  |the length of words of str
                  |
                  |all lengths of strs is list string to list nat
                  |map lengths strs
                  |
                  |show average of str is string to string
                  |display is "The average word length is:"
                  |display ++ show the average of str ++ "\n"
                  |""".stripMargin)),
            div(className := "column",
              h2("Typescript"),
            ReactMonacoEditor.height("500")
              .theme("vs-dark")
              .language("typescript")
              .value(
                """interface User {
                  |  name: string;
                  |  id: number;
                  |}
                  |
                  |class UserAccount {
                  |  name: string;
                  |  id: number;
                  |
                  |  constructor(name: string, id: number) {
                  |    this.name = name;
                  |    this.id = id;
                  |  }
                  |}
                  |
                  |const user: User = new UserAccount("Murphy", 1);""".stripMargin))
        )
        )
      )

/*    div(
      div("Monaco editor next"),
    div(ReactMonacoEditor.
      width("500").height("500")
      .theme("vs-dark")
      .value(
      """average is string to double
        |average of str is cast total length / cast num words
        |total length is sum of all lengths of words of str
        |num words is word count of str
        |
        |word count is string to nat
        |word count of str is the length of words of str
        |
        |all lengths is list string to list nat
        |all lengths of strs is map lengths strs
        |
        |show average is string to string
        |display is "The average word length is:"
        |show average of str is display ++ show the average of str ++ "\n"
        |""".stripMargin))
    )*/
  }
}
