package com.example.practice7

data class Poster(val imageId:Int, val title:String, val title2:String)
class PosterList{val list= arrayListOf(
    Poster(R.drawable.rats, "Назад в будущее", "Текст2"),
    Poster(R.drawable.rats, "Тачки", "Текст3"),
    Poster(R.drawable.rats, "Тайна Коко", "Текст4"),
    Poster(R.drawable.rats, "Интерстеллар", "Текст5"),
    Poster(R.drawable.rats, "Иван Васильевич меняет профессию", "Текст6"))
}