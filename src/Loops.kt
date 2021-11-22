fun main(args: Array<String>) {
  // FOR LOOP
    //for in loop
    var numbers = 1 .. 5
    for (number in numbers){
        println(number)
    }
    var numbers2 = 5 downTo 1
    for (number in numbers2){
        println(number)
    }
    var alphabets = 'a' .. 'e'
    for (alphabet in alphabets){
        println(alphabet)
    }
    //WHILE LOOP
    var myNum = 0
    while (myNum <=5){
        println(myNum)
        myNum++
    }
    //DO WHILE LOOP
    var myNum2 = 10
    do {
        println(myNum2)
        myNum2++
    }while (myNum2<=15)
    //challange
    //by use of any loop,print all the even numbers between 0 and 200

    var numbers3 = 0 .. 50
   for (number in numbers3){
       if (number%2 == 0){
           println(number)
       }else{
           continue
       }
   }
    //REPEAT
    repeat(10){
        println("Good Morning Cliff!")
    }
}
