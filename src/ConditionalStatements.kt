fun main(args: Array<String>){
    var age = 17
    if (age < 18){
        println("Sorry, we cant allow you to the party")
    }else{
        println("You are an adult. Enjoy yourself")
    }

    var marks = 20
    if (marks < 40){
        println("E")
    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if(marks < 80){
        println("B")
    }else{
        println("A")
    }

//when statements
    var bettingNumber = 2
    when(bettingNumber) {
        1 -> {
            println("Oops!you lost!")
        }
        2 -> {
            println("Oops!you lost!")
        }
        3 -> {
            println("Congrats!you won!")
        }
        4 -> {
            println("Oops!you lost!")
        }
        else -> {
            println("Please enter a number between 1 - 4 to bet")
        }
    }
}