import processing.core.PApplet;
/**
A program Sketch.java that mirrors drawings from loopy_lab_screenshot.pmg
@author: R. Shiu
*/
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }



  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // Drawing for Quadrant 1
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 3 + intRow *10;  
        intY = 300 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  // Drawing for Quadrant 2
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 303 + intRow *10;  
        intY = 300 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        if(intRow % 2 == 0){
        fill(0);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      }

    }
  }


  // Drawing for Quadrant 3
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 603 + intRow *10;  
        intY = 300 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        if(intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        } 
      }
    }
  }

  // Drawing for Quadrant 4
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        
        intX = 903 + intRow *10;  
        intY = 300 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
       
        if(intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
          }
        else if(intRow % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  // Drawing for Quadrant 5
  public void draw_section5(){
    int intX = 0;
    int intY = 0;
    int intcounter = 30;

    
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 30; intColumn >= (30 - intRow); intColumn--){

        intX = 3 + intRow * 10;  
        intY = 0 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  // Drawing for Quadrant 6
  public void draw_section6(){

    int intX = 0;
    int intY = 0;
    int intcounter = 30;


    for(int intRow = 29; intRow >= 0; intRow--){
      for(int intColumn = 29; intColumn >= intRow; intColumn--){

        intX = 303 + intRow * 10;  
        intY = 0 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Drawing for Quadrant 7
  public void draw_section7(){
    int intX = 0;
    int intY = 0;
    int intcounter = 30;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < (30 - intRow); intColumn++){

        intX = 603 + intRow * 10;  
        intY = 0 + 3 + intColumn *10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Drawing for Quadrant 8
  public void draw_section8(){
    int intX = 0;
    int intY = 0;
    int intcounter = 30;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn <= intRow; intColumn++){

        intX = 903 + intRow * 10;  
        intY = 0 + 3 + intColumn *10;


        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

}
