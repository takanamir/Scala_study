package main.scala

import com.dotinstall.model.User
import com.dotinstall.model.AdminUser
// import com.dotinstall.model.{User, AdminUser}
// import com.dotinstall.model._

object UsePackage {
  def main(args: Array[String]): Unit = {
    // val tom = new com.dotinstall.model.User("tom") // importしないとこう書く
    val tom = new User("tom")
    val bob = new AdminUser("bob", 23)
  }
}