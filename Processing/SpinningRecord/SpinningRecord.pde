import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int rotate = 1;
void setup() {
  size(600,600);
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(600, 600);
  background(255, 255, 255);
  minim = new Minim(this);
  song = minim.loadFile("ohedo.mp3", 512);
}

void draw() {
  if (mousePressed == true){
  rotateImage(pictureOfRecord, rotate);
  rotate += 15;
  song.play();
  }
  if (mousePressed == false){
    rotateImage(pictureOfRecord, rotate);
    song.pause();
  }
  image(pictureOfRecord, 0, 0); 
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}