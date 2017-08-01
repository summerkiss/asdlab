package edu.mum.cs.asd.lab3.template;

public abstract class AAlphabetsPrinter {
    private String[] alphas;

    public final void processAlphabet(String[] lines){
        alphas = lines;
        String s[] = getAlphaArray(getAlphaType(lines),lines);
        printAlpha(s);
    }

    public abstract Enum getAlphaType(String[] s);
    public abstract String[] getAlphaArray(Enum e,String[] s);
    public void printAlpha(String[] s){
        if(s!=null&&s.length>0){
            for (int i = 0; i <s.length ; i++) {
                System.out.println(s[i]);
            }
        }
    };

}
