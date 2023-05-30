package com.example.final_work

data class poster(val imageId:Int, val title:String, val title2:String)

class posterList{val list= arrayListOf(
    poster(R.drawable.dog, "Собака", "Dog"),
    poster(R.drawable.elef, "Слон", "Elephant"),
    poster(R.drawable.lionn, "Лев", "Lion"),
    poster(R.drawable.boa, "Удав", "Boa"),
    poster(R.drawable.ostr, "Страус", "Ostrich"))
}
