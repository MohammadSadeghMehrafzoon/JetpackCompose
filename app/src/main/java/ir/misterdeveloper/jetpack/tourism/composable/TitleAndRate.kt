package ir.misterdeveloper.jetpack.tourism.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ir.misterdeveloper.jetpack.R
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.ui.theme.Rubik


@Composable
fun TitleAndRate() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "کاخ سعدآباد",
            fontSize = 24.sp,
            color = Color.Black,
            fontFamily = Rubik,
            fontWeight = FontWeight.Bold,

            )


        Row(verticalAlignment = Alignment.CenterVertically) {

            Text(
                text = "4.8",
                fontSize = 16.sp,
                color = Color.Black,
                fontFamily = Rubik,
                fontWeight = FontWeight.Light,
            )

            Spacer(modifier = Modifier.size(7.dp))
            Icon(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "star",
                modifier = Modifier.size(28.dp)
            )
        }
    }

}