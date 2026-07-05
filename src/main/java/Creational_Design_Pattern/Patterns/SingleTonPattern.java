package Creational_Design_Pattern.Patterns;

//Say is i have to count the global total number of run and submitt hit on Compiler
//Eager loading Thread Safe
//class Judge{
//    private static final Judge judge = new Judge();
//
//
//    private Judge(){
//
//    }
//
//    public static Judge getInstance(){
//        return judge;
//    }
//}


//Lazy Loading not thread safe
//class Judge{
//    private static Judge judge;
//
//
//    private Judge(){
//
//    }
//
//    public static Judge getInstance(){
//        if(judge == null){
//            judge = new Judge();
//        }
//        return judge;
//    }
//}

//Synchronised
class Judge{
    private static Judge judge;


    private Judge(){

    }

    public static synchronized Judge getInstance(){
        if(judge == null){
            judge = new Judge();
        }
        return judge;
    }
}
public class SingleTonPattern {
    public static void main(String[] args) {

        Judge judge = Judge.getInstance();
        Judge judge2 = Judge.getInstance();
        System.out.println(judge2 + "   " + judge);


        //---------------------------------------------------------------------\\


        //Older DSA method
        //instance 1;
//        JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
//        judgeAnalytics.countRun(); //1
//        judgeAnalytics.countSubmit(); //1
//
//        //instance 2;
//        JudgeAnalytics judgeAnalytics2 = new JudgeAnalytics();
//        judgeAnalytics2.countRun(); //2
//        judgeAnalytics2.countRun();//3
//        judgeAnalytics2.countRun();//4
//        judgeAnalytics2.countSubmit();//2
//
//        System.out.println(judgeAnalytics2.getRun());
//        System.out.println(judgeAnalytics2.getSubmit());
//        System.out.println(judgeAnalytics.getRun());
//        System.out.println(judgeAnalytics.getSubmit());
    }
}
