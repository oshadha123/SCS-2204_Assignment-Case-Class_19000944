//19000944
import math.{sqrt,pow}

object MyApp extends App {
  val p1=Point(1,2)
  val p2=Point(2,3)

  println("add p1 and p2")
  println((p1+p2))
  println()
  println("move p1 by a given distance dx=2 and dy=3")
  val p3=p1.move(2,3)
  println(p3)
  println()
  println("distance between p1 and p2")
  println(p1.distance(p2))
  println()
  println("switch the x and y coordinates of p1")
  println(p1.invert())



}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  // 1.add two given points
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  // 2.move a point by a given distance dx and dy
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  // 3.distance between two given points
  def distance(a:Point):Double=sqrt(pow(x-a.x,2)+pow(y-a.y,2))
  // 4.switch the x and y coordinates
  def invert()=Point(this.y,this.x)


}
