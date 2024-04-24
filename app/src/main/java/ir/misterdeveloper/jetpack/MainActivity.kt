package ir.misterdeveloper.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.misterdeveloper.jetpack.bottomSheet.BottomSheetScaffoldSample
import ir.misterdeveloper.jetpack.profileScreen.screen.ProfileScreen
import ir.misterdeveloper.jetpack.tourism.screen.PlacePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            // ProfileScreen()

            // PlacePage()

            /*   Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                BottomSheetScaffoldSample()
            }*/



            // Gradient Color Broder Stroke in Compose
            Scaffold(modifier = Modifier.width(120.dp).height(80.dp)) {

                val gradientColor = listOf(

                    colorResource(id = R.color.purple_200),
                    colorResource(id = R.color.white),
                    colorResource(id = R.color.teal_700)
                )
                Box( modifier = Modifier
                    .fillMaxSize()
                    .height(155.8.dp)
                    .background(color = colorResource(id = R.color.cardview_dark_background))
                    .border(
                        brush = Brush.horizontalGradient(gradientColor),
                        width = 3.dp,
                        shape = RoundedCornerShape(13.dp)
                    )) {
                }
            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

   // ProfileScreen()
   // PlacePage()
}