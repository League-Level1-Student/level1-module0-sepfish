void setup(){
  size(600, 600);
  background(#B7C610);
}
void draw(){
  makeMagical();
  noStroke();
  fill(45, frameCount, 45);
  ellipse(getWormX(1), getWormY(1), 50, 50);
  fill(23, 192, frameCount);
  ellipse(getWormX(2), getWormY(2), 50, 50);
  fill(frameCount, 29, 222);
  ellipse(getWormX(3), getWormY(3), 50, 50);
  fill(134, frameCount, -frameCount);
  ellipse(getWormX(4), getWormY(4), 50, 50);
}


float frequency = .005;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10);
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}