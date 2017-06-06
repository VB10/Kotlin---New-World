
/*

aşırı yükleme
fun _sum (n1:Int,n2:Int):Int{

    return  n1+n2;
}
fun _sum (n1:Int,n2:Int,n3:Int):Int{

    return  n1+n2+n3;
}
fun _sum (n1:Double,n2:Double):Double{

    return  n1+n2;
}

println("Overloading 1:"+_sum(4,5))
println("Overloading 2:"+_sum(4,2,15))
println("Overloading 3:"+_sum(4.2,3.3))

_polymorphizim

fun show(str:String):Unit{
    println("1. polymorphism: "+str)
}
fun show(int:Int):Unit{
    println("1. polymorphism: "+int)
}

fun show(double:Double):Unit{
    println("1. polymorphism: "+double)
}
show("veli")
show(4.5)
show(15)

-global local
var  _global = "hardware"

fun show():Unit{
    print(_global)
}
//name değişkenine başka hiçbiryeden ulaşamazsınız
var name = "andro"
println("Global değişken"+_global)
println("Local değişken"+name)

--trycatch
    try {
    print("Bir sayı giriniz: ")
        var number:Int = readLine()!!.toInt()

}catch (ex:Exception){
    println("Hata "+ex.message)
}


 */

class Car(Age:Int,Name:String,Model:String){

    init {
        println("Arabanın adı: $Name")
        println("Arabanın yaşı: $Age")
        println("Arabanın modeli: $Model")
    }

}


fun main(args: Array<String>) {

    var car1 = Car(12,"Hardware","BMW")

}