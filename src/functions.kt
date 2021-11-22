fun main(args:Array<String>) {
    motto()
    vision()
    addition()
    avarage(1.2, 3.4, 4.0)
    simpleInerest(100,2,5)
    BMI(70.0,3.0)
}
fun motto(){
  println("Hello, this is our motto!")
}
fun vision(){
    println("Hello, this is our vision!")
}
fun addition(){
    var x = 40
    var y = 20
    var z = x+y
    println("Your answer is $z")
}
fun avarage(x:Double,y:Double,z:Double){
    var answer = (x + y + z)/3.0
    println("Hey, your answer is $answer")
}
fun simpleInerest(p:Int, r:Int, t:Int){
    var SI = (p * r * t)/100
    println("Hey, your interest is $SI")
}
//Challange
//Create a function that calculates the BMI of a user and gives the result as
//either:
// i.Underweight
// ii.Normal weight
// iii.Overweight
// iv. Obese
//N/B Google for an actual BMI range scale
fun BMI(w:Double, h:Double){
    var myBmi = w/Math.pow(h,2.0)
    if (myBmi < 18.5){
        println("You are Underweight!")
    }else if (myBmi < 24.9){
        println("You are Normal weight!")
    }else if (myBmi < 29.9){
        println("You are Overweight!")

    }else{
        println("You are Obese!")
    }
}
