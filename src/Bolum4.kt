
/*
1
   var count:Int =5;
    while (count <10){
        //count değeri 10 dan küçük olana kadar çalışır 10 olduğunda durur
        print(count)
        count++;
2

    do {
    var result : Int ?

        println("Çıkmak için 0 'a \n Tekrarlamak için 1'e basınız")
        print("Cevabınız:")
        result= readLine()!!.toInt()
        println("------------")

    }while (result!=0)
    }
3
      for (count in 1..10){

        //count ==4 olduğunda kendinden bir sonrakine değeri geçiriyor
        //ve döngü devam ediyor
        if (count==4) continue
        print(count)
    }
    print("\n")
    for (count2 in 1..10){

        //count ==4 olduğunda break'ı görüp döngüden çıkıp
        //bulunduğu döngüyü bitiriyor
        if (count2==4) break
        print(count2)
    }
4
        var  name:String =" we love kotlin<3 "
    //string değişkenleri ekranda göstermenin yolları
    println(name)
    println("Welcome"+name)
    println("Welcome $name")

    //stringler aynı zamanda bir dizidir name[0] dediği name değişkeninin
    //ilk harfidir
    println("İlk harf "+ name[0])

    //string değişkenlerini sadece bir fonksyion ile komple büyütüp küçültebiliriz
    println("Büyük ${name.toUpperCase()}")
    println("Küçük"+name.toLowerCase())

    //string değişkenler i ayırmak istiyor isek belirli bir kurala göre
    //mesela we love kotlin 'deki boşluklara göre ayırmak ve bunları birer ayrı hece
    //olarak almak istiyor isek split kullanılır
    //buraya bir çok kural yazılabilir Regular Expression konusunu burada bakmanızı tavisye ederim
    println("Boşluklara göre ayırma"+name.split(" "))

    //bizim değişkenimizdeki başı ve soundaki boşlukları siler
    println(name.trim())

    4
      // (5) eleman sayısını belirtir {} içersindeki elemanların değerlerini
    //eğer sadece tek değer atar isek tüm elamanlara default değeri olarak atanır
var ArrayInt = List<Int>(5){1}
    // eleman sayısı 5 olsada diziler listeler daima 0'dan başlar
    for (obj in ArrayInt) print(obj)

5
  var ArrayStr= Array<String>(3){"anadeğer"}

    for (obj in ArrayStr) println(obj)

6
    //istediğimiz veri tiplerini verip custom bir liste oluşturabiliriz
    var map= HashMap<Int,String>()

    map.put(1,"vb")
    map.put(2,"is")
    map.put(44,"life")

    println(map.get(44))

 */


fun sum(n1:Int,n2:Int):Int{
    //gelen değişkenleri bir sonuca atayıp sonrasında
    // geri döndürüp number1 e eşitliyoruz
    var result:Int?


    result=n1+n2;

    return  result
}
fun prodct(n1:Double,n2:Double):Double{

    return  n1*n2
}
fun display(n1:Int):Unit{
    //herhangi birşey döndürmeden sadece çalışınca
    //gelen değeri ekrana basıyor
    print("Toplamın Sonucu $n1")

}
fun main(args: Array<String>) {

    var  number1 = sum(1,15)
    var  number2 = prodct(2.5,4.0)

    println("Çarpım:"+number2)
    display(number1)

}