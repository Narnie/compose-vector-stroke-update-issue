# compose-vector-stroke-update-issue
Example app to demonstrate a bug when updating the vector stroke width in Jetpack Compose


- Stroke Width is not updated as expected when the Vector Drawable is changed during runtime. 
- Stroke Width is updated if the tree hierachy is different in the Vector Drawable - in the example app the path is wrapped in a group to get it to update. 

https://user-images.githubusercontent.com/20655175/211729858-2dcc8ece-dc33-45dd-8a32-16dfe44c7dbd.mov

