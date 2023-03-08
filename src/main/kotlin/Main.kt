fun main(args: Array<String>) {
    print("Masukan Angka : ")
    val input = readln().toInt()

    if(prime(input)) println("$input adalah bilangan prima")
    else println("$input bukan bilangan prima")
}

fun prime(number: Int): Boolean{
    for(i in 2 until number){
        if(number % i == 0) return false
    }
    return true
}