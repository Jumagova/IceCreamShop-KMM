package org.company.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PermIdentity
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFD538))
            .padding(start = 24.dp, top = 24.dp, end = 24.dp, bottom = 18.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Header(title = "Products", color = Color(0xFF29292B)) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.FilterAlt,
                    contentDescription = "filter",
                    tint = Color(0xFF29292B)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.GridView,
                    contentDescription = "view",
                    tint = Color(0xFF29292B)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search",
                    tint = Color(0xFF29292B)
                )
            }
        }
        TopNavBarItem()
//            ProductsItem(name = "Ice", description = "Lerom", image = painterResource(id = R.drawable.image1))
        ProductsItem(
            name = "Vanilla Ice Cream",
            description = "Vanilla ice cream, dark chocolate chips and crunchy nuts."
        )
        BottomNavigationBar()
    }
}


@Composable
fun Header(
    title: String = "Products",
    color: Color,
    icons: @Composable () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = color,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            icons()
        }
    }
}

@Composable
fun TopNavBarItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            modifier = Modifier.padding(end = 24.dp),
            text = "all products",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
//            textDecoration = TextDecoration.
        )
        Text(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "ice cream",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "cups",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProductsItem(
    name: String = "Oreo",
    description: String = "Description",
//    image: Painter
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        shape = RoundedCornerShape(corner = CornerSize(42.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF29292B)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.8f),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = name,
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(

                        text = description,
                        color = Color.White,
                        fontSize = 16.sp,
                    )
                }
                Column(
                    modifier = Modifier.padding(vertical = 16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    IconButton(
                        modifier = Modifier
                            .size(24.dp),
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.PushPin,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    IconButton(
                        modifier = Modifier
                            .size(24.dp),
                        onClick = { }
                    ) {
                        Icon(
                            modifier = Modifier.size(18.dp),
                            imageVector = Icons.Outlined.Send,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
            Image(
                painter = painterResource(res = "drawable/image1.png"),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "in stock",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "$ 8.99",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Black
                    )
                }
                Button(
                    modifier = Modifier.size(width = 132.dp, height = 56.dp),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFD538)
                    ),
                    shape = RoundedCornerShape(corner = CornerSize(16.dp))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "To cart",
                            color = Color(0xFF29292B),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            imageVector = Icons.Outlined.ShoppingBag,
                            contentDescription = "Shopping",
                            tint = Color(0xFF29292B)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(
                color = Color(0XFFFFEEAF),
                shape = RoundedCornerShape(corner = CornerSize(16.dp))
            )
            .clip(shape = RoundedCornerShape(corner = CornerSize(16.dp))),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Row {
            Icon(imageVector = Icons.Outlined.Menu, contentDescription = "menu")
            Text(
                text = "menu",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
            )
        }
        Row {
            Icon(imageVector = Icons.Outlined.ShoppingBag, contentDescription = "cart")
            Text(
                text = "cart",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
            )
        }
        Row {
            Icon(imageVector = Icons.Outlined.PermIdentity, contentDescription = "user")
            Text(
                text = "user",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
            )
        }
    }
}