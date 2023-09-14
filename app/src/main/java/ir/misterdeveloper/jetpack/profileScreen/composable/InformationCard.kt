package ir.misterdeveloper.jetpack.profileScreen.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.ui.theme.CardBackgroundColor
import ir.misterdeveloper.jetpack.ui.theme.PrimaryTextColor
import ir.misterdeveloper.jetpack.ui.theme.Rubik
import ir.misterdeveloper.jetpack.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(title: String, information: String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp) , backgroundColor = CardBackgroundColor
    ) {

        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            Text(
                text = title,
                fontWeight = FontWeight.Normal,
                fontFamily = Rubik,
                fontSize = 9.sp,
                color = SecondaryTextColor
            )
            Text(
                text = information,
                fontFamily = Rubik,
                fontWeight = FontWeight.Medium,
                color = PrimaryTextColor,
                fontSize = 14.sp
            )
        }
    }

}