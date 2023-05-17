package com.example.practice5

data class Poster(val imageId:Int, val title:String, val title2:String)
class PosterList{val list= arrayListOf(
    Poster(R.drawable.back, "Назад в будущее", "Текст2"),
    Poster(R.drawable.cars, "Тачки", "Текст3"),
    Poster(R.drawable.coco, "Тайна Коко", "Текст4"),
    Poster(R.drawable.inter, "Интерстеллар", "Текст5"),
    Poster(R.drawable.ivan, "Иван Васильевич меняет профессию", "Текст6"),
    Poster(R.drawable.lion, "Король лев", "Текст7"),
    Poster(R.drawable.lord, "Властелин колец", "Текст8"),
    Poster(R.drawable.prison, "Побег из Шоушенка", "Текст9"),
    Poster(R.drawable.pump, "Криминальное чтиво", "Текст10"),
    Poster(R.drawable.rats, "Рататуй", "Текст11"),
    Poster(R.drawable.fight, "Бойцовский клуб", "Текст12"),
    Poster(R.drawable.gm, "Зеленая миля", "Текст13"
    ))
}
