int x = int(random(800));
int y = 0;
int score = 0;
boolean touch = false;
boolean win = false;
void setup() {
  size(800, 800);

}

void draw() {
  background(#317F81);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  if (score == 20){
    win = true;
  }
  
  if (win == true){
    background(#317F81);
    text("You win!", 400, 400);
  }
  
  fill(#91F5F7);
  stroke(#A5FDFF);
  ellipse(x, y, 25, 50);
  
  fill(#6ACE76);
  stroke(#6ACE76);
  rect(mouseX, mouseY, 60, 50);
  
  if (win == false) {
  y += (score + 1);
  
  if (x > mouseX && x < mouseX + 60 && y > mouseY && y < mouseY + 50){
       touch = true;
  } else if (y >= 800 && touch == false){
    y = 0;
    score--;
    x = int(random(800));
    ellipse(x, y, 25, 50);
  }
  if (touch == true){
       touch = false;
       score++;
       y = 0;
       x = int(random(800));
       ellipse(x, y, 25, 50);
      }
  }
}