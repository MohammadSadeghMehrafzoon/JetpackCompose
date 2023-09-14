package ir.misterdeveloper.jetpack.profileScreen.screen

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ir.misterdeveloper.jetpack.R
import ir.misterdeveloper.jetpack.profileScreen.composable.*
import ir.misterdeveloper.jetpack.ui.theme.GreenForProfile
import ir.misterdeveloper.jetpack.ui.theme.Rubik


@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Header(title = "Your Account", subTitle = "Edit or manage your Account")
        SpacerVertical32()

        Image(
            painterResource(id = R.drawable.me),
            contentDescription = "profile picture",
            modifier = Modifier
                .clip(
                    RoundedCornerShape(16.dp)
                )
                .size(width = 128.dp, height = 128.dp)
        )

        SpacerVertical24()
        TextButton(text = "Change profile picture") {}
        SpacerVertical32()
        
        Row(modifier = Modifier.fillMaxWidth()) {


            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = "FirstName", information = "Mohammad ")
                
            }
            Spacer(modifier = Modifier.width(16.dp))

            Box(modifier = Modifier.weight(1f)){
                InformationCard(title = "LastName", information = "Mehrafzoon")
            }

            
        }

        InformationCard(title = "Location", information = "Iran")
        InformationCard(title = "Email", information = "Example@gmail.com")
        InformationCard(title = "Phone", information = "+201156477320")
        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            colors = ButtonDefaults.buttonColors(GreenForProfile),
            shape = RoundedCornerShape(16.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = "Save",
                color = Color.White,
                fontFamily = Rubik,
                fontWeight = FontWeight.Medium,
            )
        }


    }

}