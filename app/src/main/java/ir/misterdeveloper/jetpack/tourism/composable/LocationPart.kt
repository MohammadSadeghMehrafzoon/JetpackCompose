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
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.R
import ir.misterdeveloper.jetpack.ui.theme.Rubik

@Composable
fun LocationPart() {


    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription = "",
            tint = Color.Blue,
            modifier = Modifier.size(14.dp)
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = "تهران",
            fontSize = 16.sp,
            color = Color.Blue,
            fontFamily = Rubik,
            fontWeight = FontWeight.Light,

            )

    }
}