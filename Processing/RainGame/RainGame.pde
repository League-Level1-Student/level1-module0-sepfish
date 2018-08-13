int x = int(random(600));
int y = 0;
void setup() {
  size(600, 600);

}

void draw() {
    background(#317F81);
  fill(#91F5F7);
  stroke(#A5FDFF);
  ellipse(x, y, 25, 50);
    fill(#6ACE76);
  rect(mouseX, mouseY, 75, 50);
  y += 2;
  if (y == 600){
    y = 0;
    x = int(random(600));
    ellipse(x, y, 25, 50);
  }
}