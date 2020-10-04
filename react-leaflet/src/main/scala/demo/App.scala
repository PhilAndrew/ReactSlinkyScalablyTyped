package demo

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html.div
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

    div(
      div("Monaco editor next"),
    div(ReactMonacoEditor.withProps(MonacoEditorProps().set("height", "500").set("width", "500"))),
    Map(MapProps().setCenter(position).setZoom(13))(
      TileLayer(
        TileLayerProps(url = "https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png")
          .setAttribution("&copy; <a href=&quot;http://osm.org/copyright&quot;>OpenStreetMap</a> contributors")
      ),
      Marker(MarkerProps(position = position))(
        Popup(PopupProps())("A pretty CSS3 popup.\nEasily customizable.")
      )
    )
    )
  }
}
