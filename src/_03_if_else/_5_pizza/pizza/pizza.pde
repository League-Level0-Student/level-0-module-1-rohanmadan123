PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(20,20);
    olive = loadImage("olive.png");
    olive.resize(18,18);
    mushroom = loadImage("mushroom.png");
    mushroom.resize(20,20);
    size(600,600);
    fill(212,204,133);
    ellipse(300,300, 150, 150);
    fill(255,0,0);
    ellipse(300,300, 127, 127);
    fill(247,255,25);
    ellipse(300, 300, 120, 120);
}
void draw() {
    image(pepperoni,315,250);
    image(pepperoni,280,250);
    image(pepperoni,250,300);
    image(pepperoni,315,300);
    image(pepperoni,290,280);
    if(mousePressed){
      image(mushroom, 260, 310);
      image(mushroom, 295, 285);
      image(mushroom, 305, 240);
    }
    if(mousePressed && (mouseButton == RIGHT)) {
    image(olive,250, 290);
}
}
