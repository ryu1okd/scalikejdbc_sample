package models

import scalikejdbc._
import scalikejdbc.SQLInterpolation._
/**
 * Created with IntelliJ IDEA.
 * User: okadaryuichi
 * Date: 2013/11/23
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
case class User(id:Int,name:String,email:String)

object User extends SQLSyntaxSupport[User]{

}