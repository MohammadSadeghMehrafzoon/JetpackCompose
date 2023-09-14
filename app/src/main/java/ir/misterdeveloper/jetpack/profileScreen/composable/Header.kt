package ir.misterdeveloper.jetpack.profileScreen.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.ui.theme.PrimaryTextColor
import ir.misterdeveloper.jetpack.ui.theme.Rubik

@Composable
fun Header(title: String, subTitle: String) {

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start) {

        Text(
            text = title,
            fontSize = 18.sp,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = subTitle,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = PrimaryTextColor
        )

    }

}