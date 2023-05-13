package com.example.practice5

data class Poster(val imageId:Int, val title:String)
class PosterList{val list= arrayListOf(
    Poster(R.drawable.back, "Назад в будущее"),
    Poster(R.drawable.cars, "Тачки"),
    Poster(R.drawable.coco, "Тайна Коко"),
    Poster(R.drawable.inter, "Интерстеллар"),
    Poster(R.drawable.ivan, "Иван Васильевич меняет профессию"),
    Poster(R.drawable.lion, "Король лев"),
    Poster(R.drawable.lord, "Властелин колец"),
    Poster(R.drawable.prison, "Побег из Шоушенка"),
    Poster(R.drawable.pump, "Криминальное чтиво"),
    Poster(R.drawable.rats, "Рататуй"),
    Poster(R.drawable.fight, "Бойцовский клуб"),
    Poster(R.drawable.gm, "Зеленая миля"
    ))
}
