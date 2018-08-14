int x = int(random(800));
int xSpeed = 5;
int ySpeed = 5;
int y = 0;
int score = 0;
boolean win = false;

import ddf.minim.*;  
Minim minim;
AudioSample sound;

void setup() {
  size(800, 600);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}

void draw() {
  background(#9ECEC4);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  noStroke();
  fill(#7023B4);
  ellipse(x, y, 30, 30);
  fill(#B4239A);
  rect(mouseX, 500, 100, 25);
  
  if (score == 20) {
    win = true;
  }
  
  if (win == false) {
  x = x + xSpeed;
  y = y + ySpeed;
  if (x >= 800) {
    xSpeed = -5;
  }
  if (x <= 0) {
    xSpeed = 5;
  }
  if (y >= 600) {
    ySpeed = -5;
    sound.trigger();
    score--;
  }
  if (y <= 0) {
    ySpeed = 5;
  }
  if (intersects(x, y, mouseX, 500, 100) == true){
    score++;
    ySpeed = -5;
  }
  }
  if (win == true) {
    fill(#172F81);
    text("You win!", 400, 300);
  }
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}