fun main(args: Array<String>) {
    println("Enter a number")
    var num:Int = readLine()!!.toInt()

    if (num == 0 ){
        print("Sh20=1GB for 1hr")
    }
    else if (num == 1 ){
        print("Data deals")
    }
    else if (num == 2){
        print("Daily bundles")
    }
    else if (num == 3){
        print("Weekly bundles")
    }
    else if (num == 4){
        print("Go monthly")
    }
    else if (num == 5){
        print("No expiry")
    }
    else if (num == 6){
        print("Okoa data")
    }
    else if (num == 7){
        print("More")
    }
    else {
        print("Invalid enter another number")
    }

}