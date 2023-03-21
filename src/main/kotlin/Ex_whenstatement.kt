fun main(args: Array<String>) {

    println("Enter a number")
    var saf:Int = readLine()!!.toInt()
    when(saf){

        1-> println("Data deals")
        2-> println("Daily bundles")
        3-> println("Weekly bundles")
        4-> println("Go monthly")
        5-> println("No expiry")
        6-> println("Hot minutes")
        7-> println("Enroll bonga points")
        8-> println("Okoa data")
        9-> println("Check balance")
        10-> println("More")

        else-> println("Enter another digit")
    }
}