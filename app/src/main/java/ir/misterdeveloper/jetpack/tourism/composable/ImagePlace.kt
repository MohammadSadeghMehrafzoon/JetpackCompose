package ir.misterdeveloper.jetpack.tourism.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ir.misterdeveloper.jetpack.R

@Composable
fun ImagePlace() {

    Image(
        painter = painterResource(id = R.drawable.sadabad),
        contentDescription = "The Sa'dabad Complex",
        modifier = Modifier.height(555.dp),
        contentScale = ContentScale.Crop
    )

}