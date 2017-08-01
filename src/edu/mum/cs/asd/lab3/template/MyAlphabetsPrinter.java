package edu.mum.cs.asd.lab3.template;

public class MyAlphabetsPrinter extends AAlphabetsPrinter {


    @Override
    public Enum getAlphaType(String[] s) {
        if(s[0].equals(AlphaType.VERTICAL.type())) return AlphaType.VERTICAL;
        else if(s[0].equals(AlphaType.HORIZONTAL.type())) return AlphaType.HORIZONTAL;
        else return AlphaType.NONE;
    }

    @Override
    public String[] getAlphaArray(Enum e, String[] s) {
        String s1[] = new String[s.length-5];
        if(s!=null&&s.length>0){
            if(s[0].equals(AlphaType.VERTICAL.type())){

                for (int i = 5; i <s.length ; i++) {
                    StringBuffer sb = new StringBuffer();
                    sb.append(s[i]);
                    for (int j = Integer.parseInt(s[1])-1; j >=0 ; j--) {
                        sb.append(s[i].charAt(j));
                    }
                    s1[i-5] = sb.toString();
                }
            }
            if(s[0].equals(AlphaType.HORIZONTAL.type())){
                s1 = new String[(s.length-5)*2];
                for (int i = 5; i <s.length ; i++) {
                    s1[i-5] = s[i];
                    s1[s1.length-i-1+5] = s[i];
                }
            }


        }
        return s1;
    }

    public static void main(String[] args){
        String s[] = {"VERTICAL","5","14","10","20",
                "-----",
                "----+",
                "---++",
                "--++-",
                "--++-",
                "-++--",
                "-++--",
                "-++--",
                "-++++",
                "-++-- ",
                "-++--",
                "-++--",
                "-++--",
                "-++--"
        };

        String s1[] = {"HORIZONTAL","9","8","10","20",
                "---------",
                "---++++--",
                "--++--++-",
                "-++----++",
                "-++------",
                "-++------",
                "-++------",
                "-++------"
        };


        MyAlphabetsPrinter mp = new MyAlphabetsPrinter();
        mp.processAlphabet(s1);
    }
}
