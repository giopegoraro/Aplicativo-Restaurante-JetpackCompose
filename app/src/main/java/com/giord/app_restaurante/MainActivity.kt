package com.giord.app_restaurante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.giord.app_restaurante.list_item.FoodItem
import com.giord.app_restaurante.model.Food

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodList()
        }
    }
}

@Composable
private fun FoodList(){

        val foodList: MutableList<Food> = mutableListOf(
            Food(
                imgFood = R.drawable.mac,
                foodName = "Macarrão à bolonhesa",
                foodDescription = "Descrição muito criativa",
                price = "$ 19.00"
            ),
            Food(
                imgFood = R.drawable.ham,
                foodName = "Hambúrguer",
                foodDescription = "Descrição muito criativa",
                price = "$ 30.00"
            ),
            Food(
                imgFood = R.drawable.piz,
                foodName = "Pizza Vegetariana",
                foodDescription = "Descrição muito criativa",
                price = "$ 40.00"
            ),
            Food(
                imgFood = R.drawable.dju,
                foodName = "Sushi",
                foodDescription = "Descrição muito criativa",
                price = "$ 20.00"

            ),
            Food(
                imgFood = R.drawable.parm,
                foodName = "Bife à Parmegiana",
                foodDescription = "Descrição muito criativa",
                price = "$ 35.00"

            )
        )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn{
            itemsIndexed(foodList){ _,food ->
                FoodItem(food)

            }
        }
    }
}