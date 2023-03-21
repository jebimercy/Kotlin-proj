fun main(args: Array<String>) {

    println("Enter the floor")
    var point:Int = readLine()!!.toInt()
    when(point) {

        1-> println("Go to first floor")
        2-> println("Go to second floor")
        3-> println("Go to third floor")
        4-> println("Go to fourth floor")

        else-> println("No more floors")
    }
}