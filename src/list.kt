fun main() {
  println(evenIndices(listOf("Anastacia","Belyse","Aluel","Edna","Wangari","Beth","Daisy","Stella","Achol","Sindeti")))
    println(averageHeight(listOf(34.5,23.6,21.4,12.8,19.5) as MutableList<Double>))
humanBeing()
    watu()
    var car= listOf(
        Car("mkj67",120),
        Car("FERA54",112)
    )
    println(car(listOf(120,112)))
}
fun evenIndices(name:List<String>):List<String>{
    var names= mutableListOf<String>()
        for (x in name )

        if (name.indexOf(x)%2==0){
            names.add(x)
        }
    return names
}



fun averageHeight(height: MutableList<Double>):Double {

    val totalheight=height.sum()
    val avg=height.average()
    println(totalheight)
    return avg
 }
data class Person(val name:String,val age:Int,val height:Double,val weight:Double)
fun humanBeing(){
    var people= listOf(
        Person("Mercy",12,20.3,10.1),
        Person("Tabby",22,32.4,12.4),
        Person("Daisy",23,25.1,32.1),
        Person("Edna",22,12.7,60.1),
    )
    var age=people.sortedByDescending { Person->Person.age }
    println(age)
}
data class Mtu(val name:String,val age:Int,val height:Double,val weight:Double)
fun watu() {


    var people = mutableListOf(
        Person("Mercy", 12, 20.3, 60.1),
        Person("Tabby", 22, 32.4, 72.4),
        Person("Daisy", 23, 25.1, 32.1),
        Person("Edna", 22, 12.7, 60.1),

        )
    people.addAll(listOf(
        Person("Belyse",18,32.1,50.3),
        Person("Beth",24,21.9,68.4),
    ))
    println(people)

}
data class Car(var registration:String,var mileage:Int)
fun car(mileage:List<Int>):Int{
    var speed=mileage.average().toInt()
    return speed
}





