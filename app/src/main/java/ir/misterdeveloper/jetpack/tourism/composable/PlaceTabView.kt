package ir.misterdeveloper.jetpack.tourism.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.ui.theme.Rubik


@Composable
fun PlaceTabView(
    modifier: Modifier = Modifier,
    categoreis: List<String>,
    onTabSelected: (selectedIndex: Int) -> Unit
) {

    var selectedTabIndex by remember { mutableStateOf(0) }

    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        backgroundColor = Color.Transparent,
        contentColor = Color.White,
        indicator = {}, edgePadding = 0.dp
    ) {

        categoreis.forEachIndexed { index, item ->

            Tab(
                selected = selectedTabIndex == index, onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }, modifier = Modifier
                    .padding(end = 12.dp)
                    .height(30.dp)
                    .width(76.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFF3F3F3))
                    .border(
                        if (selectedTabIndex == index) 1.dp else 0.dp,
                        Color(0xFFEDEDED), CircleShape
                    )
            ) {

                Box(contentAlignment = Alignment.Center) {

                    Text(text = item, fontSize = 12.sp,
                        fontFamily = Rubik,
                        fontWeight = FontWeight.Normal,
                        color = if (selectedTabIndex == index)
                            Color(0xFF666666)
                        else Color(0xFF969696)

                    )

                }

            }
        }

    }


}