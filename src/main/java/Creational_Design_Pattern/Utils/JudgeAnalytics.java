package Creational_Design_Pattern.Utils;

public class JudgeAnalytics {
    private int run = 0;
    private int submit = 0;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSubmit() {
        return submit;
    }

    public void setSubmit(int submit) {
        this.submit = submit;
    }
    public void countRun(){
        run++;
    }
    public void countSubmit(){
        submit++;
    }
}
