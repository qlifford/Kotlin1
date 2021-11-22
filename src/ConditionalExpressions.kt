fun main(args: Array<String>) {
    //IF EXPRESSIONS
    var age =  18
    var result = if (age < 18){
        "Sorry You are underage!"
        }else{
        "You qualify"
    }
    //WHEN STATEMENTS
    var bettingNumber = 3
    var betResult = when(bettingNumber) {
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