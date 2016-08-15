package com.fcback

import spray.json._
import spray.util._
import spray.http._

case class Hero(id: Int, name: String)

object HeroJsonProtocol extends DefaultJsonProtocol{
    implicit val heroFormat = jsonFormat2(Hero)
}