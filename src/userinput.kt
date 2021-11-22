import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("How many names do you have?")
    var numberOfNames = chukua.nextInt()
    var names = arrayOfNulls<String>(numberOfNames)
    println("Enter the $numberOfNames names")
    var counter = 0
    while (counter < numberOfNames){
        names[counter] = chukua.next()
        counter++
    }
    for (jina in names) {
        println(jina)
    }
}