fun main(){
    val res1=Restaurants("KFC",4.1,200)
    val res2=Restaurants("McDonalds",3.9,150)
    val res3=Restaurants("Subway",4.0,250)
    val res4=Restaurants("Dominoz",4.3,400)
    val res5=Restaurants("PizzaHut",3.5,200)

    val restaurantList= mutableListOf(res1,res2,res3)
    restaurantList.add(res4)
    restaurantList.add(res5)

    for(res in restaurantList){
        println(res)
    }
}