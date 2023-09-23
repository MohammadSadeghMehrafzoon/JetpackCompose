package ir.misterdeveloper.jetpack.tourism.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.ui.theme.Rubik

@Composable

fun DescriptionAndReservedButton() {

    Text(

        text = "مجموعه فرهنگی - تاریخی سعدآباد مجموعه\u200Cای ۱۱۰ هکتاری در شمال شهر تهران است که توسط شاهان در دوره قاجار و دوره پهلوی، بنیانگذاری شده و گسترش یافت",

        fontSize = 16.sp,
        fontFamily = Rubik,
        fontWeight = FontWeight.Light, color = Color(0xFF574120),
        modifier = Modifier
            .padding(end = 5.dp)
            .fillMaxWidth(),
        lineHeight = 25.sp
    )

    Row(

        modifier = Modifier.fillMaxWidth(),

        horizontalArrangement = Arrangement.End

    ) {
        Button(

            onClick = {},

            modifier = Modifier.size(115.dp, 38.dp),

            colors = ButtonDefaults.buttonColors(

                backgroundColor = Color(0xFFe1d4c8),
                contentColor = Color(0XFF826855)
            ),
            shape = CircleShape,
            contentPadding = PaddingValues(8.dp)
        ) {
            Text(

                text = "رزرو بلیت",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Rubik,
            )
        }
    }
}



