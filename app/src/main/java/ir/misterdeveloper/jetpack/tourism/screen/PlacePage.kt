package ir.misterdeveloper.jetpack.tourism.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ir.misterdeveloper.jetpack.tourism.composable.*


val category = listOf("جزئیات", "تصاویر", "نظرات")

@Composable
fun PlacePage() {

    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(Modifier.fillMaxSize()) {

        Box(
            Modifier
                .weight(1f)
                .background(Color.Gray)
                .verticalScroll(rememberScrollState())
        ) {

            ImagePlace()
            Column(modifier = Modifier.fillMaxSize()) {

                Spacer(modifier = Modifier.height(528.dp))
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                        .background(Color.White)
                        .padding(
                            horizontal = 20.dp
                        )
                ) {

                    Spacer(modifier = Modifier.size(20.dp))
                    TitleAndRate()
                    LocationPart()
                    Spacer(modifier = Modifier.size(25.dp))
                    PlaceTabView(categoreis = category) {
                        selectedTabIndex = it
                    }

                    Spacer(modifier = Modifier.size(15.dp))

                    when(selectedTabIndex){
                        0 ->{
                            DescriptionAndReservedButton()}
                    }

                    Spacer(modifier = Modifier.size(15.dp))




                }

            }


        }

    }

}