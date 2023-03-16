fun main(args: Array<String>) {
    println("Enter your weight")
    var weight:Int = readLine()!!.toInt()
    println("Enter your height")
    var height:Double = readLine()!!.toDouble()
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }
    else if (bmi <= 29){
        println("Normal")
    }
    else if (bmi <= 34){
        println("Overweight")
    }
    else {
        println("Obese")
    }
}