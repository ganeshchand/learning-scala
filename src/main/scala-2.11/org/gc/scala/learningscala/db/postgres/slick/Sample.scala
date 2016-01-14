package org.gc.scala.learningscala.db.postgres.slick

import slick.driver.PostgresDriver.api._

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}

object Sample {

  class Users(tag: Tag) extends Table[(Int, String)](tag, "users") {
    def id = column[Int]("id")
    def username = column[String]("username")
    def * = (id, username)
  }

  def main(args: Array[String]) {
    println("Scala Slick with PostgreSQL")
    val connectionUrl = "jdbc:postgresql://localhost/scala?user=postgres&password=gw"
    val users = TableQuery[Users]
    println(users.baseTableRow.username.toString())
//    val db = Database.forConfig("postgresDB")
    val db = Database.forURL(connectionUrl)
    db.run(users.result).foreach(x => println(x.toString))
    db.run(users.result).map(_.foreach {
      case (id, username) => println(s"${id}: ${username}")
      case _ => println("Unknown")
    })
  }
}
