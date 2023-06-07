package playground

case class Employee(employee:String, age:Int)

object Employee extends App {

  val employe = List(Employee("ABC",14),Employee("FV",19),Employee("ABCS",20),Employee("xd",67),Employee("okk",18))

   val employee = employe.filter(x => x.age >= 18 && x.age <= 60).map(_.employee).mkString(",")

   println(employee)
}
