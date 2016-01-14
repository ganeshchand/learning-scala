package org.gc.scala.learningscala.db.postgres.jdbc
import java.sql.{Connection, DriverManager, ResultSet};
/**
  * Created by gchand on 1/11/2016.
  */
object Sample {
  def main(args: Array[String]) {
    // Database Config
    val connectionUrl = "jdbc:postgresql://localhost:5432/scala?user=postgres&password=gw"
    // Load the driver
    classOf[org.postgresql.Driver]
    // Setup the connection
    val conn = DriverManager.getConnection(connectionUrl)
    insert()


    //For Query: Read-Only
    def query(): Unit = {
      try {
        // Configure to be Read Only
        val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
        // Execute Query
        val rs = statement.executeQuery("SELECT id FROM users LIMIT 5")
        // Iterate Over ResultSet
        while (rs.next) {
          println(rs.getString("id"))
        }
      } finally {
        conn.close()
      }
    }


    def insert(): Unit = {
    //For Insert, Update & Delete
    val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)
    // do database insert
    try {
      val prep = conn.prepareStatement("INSERT INTO users (id, username) VALUES (?, ?) ")
      prep.setInt(1, 3) // column 1
      prep.setString(2, "Ganesh") // column 2
      prep.executeUpdate
    }
    finally {
      conn.close
    }
  }
  }
}
