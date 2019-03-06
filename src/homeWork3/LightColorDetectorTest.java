package homeWork3;


public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectPurple();
        test.shouldDetectBlue();
        test.shouldDetectGreen();
        test.shouldDetectYellow();
        test.shouldDetectOrange();
        test.shouldDetectRed();

    }

    public void shouldDetectPurple(){

    LightColorDetector detector = new LightColorDetector();

    String result = detector.detect(449);

    compareResult(result.equals("Purple"), "shouldDetectPurple");

}



        public void shouldDetectBlue(){

            LightColorDetector detector = new LightColorDetector();
            String result = detector.detect(493);
            compareResult(result.equals("Blue"), "shouldDetectBlue");
        }

    public void shouldDetectGreen(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(568);
        compareResult(result.equals("Green"), "shouldDetectGreen");
    }
    public void shouldDetectYellow(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(588);
        compareResult(result.equals("Yellow"), "shouldDetectYellow");
    }
    public void shouldDetectOrange(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(617);
        compareResult(result.equals("Orange"), "shouldDetectOrange");
    }
        public void shouldDetectRed(){
            LightColorDetector detector = new LightColorDetector();
            String result = detector.detect(748);
            compareResult(result.equals("Red"), "shouldDetectRed");
        }

                                void compareResult(boolean result, String testName){
                                    if (result){
                                        System.out.println(testName + " diapazona");

                                    } else {

        }
                                        System.out.println(testName + " arpus diapazona");
                                    }
                                }

