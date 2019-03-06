package homeWork3;

public class LightColorDetector {

    public String detect(int level){

        if (level < 449){
            return " Purple" ;
        }

        if(level < 494){
            return " Blue ";
        }

        if(level < 569){
            return "Green";
        }

        if(level < 589){
            return "Yellow";
        }

        if(level < 619){
            return "Orange";
        }

        if(level < 749){
            return "Red";
        }
        return "Arpus diapazona";
    }}