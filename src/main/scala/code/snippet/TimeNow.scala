package code.snippet

import net.liftweb._
import util._
import Helpers._
/**
 * File Description
 * ----------------
 * <describe why this file is created .....>
 *
 * code.snippet 
 * User: prassee
 * Date: 21/06/11
 * Time: 7:46 AM        t
 */

object TimeNow {
  def render = "* *" #> now.toString
}