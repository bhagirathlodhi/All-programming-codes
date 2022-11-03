package Com.java.collection;

public class SLV {
	public static void printKeypad(int input)
    {
    String []Answer= keypad_codes(input);
        for(int i=0;i<Answer.length;i++)
            System.out.println(Answer[i]);
        
  }
    public static  String[] keypad_codes(int num)
    {
        if(num%10==0)
        {
            String[]Null={""}; return Null;
        }
        String[] Remaining_Part=keypad_codes(num/10);
        String[] smallAnswer=Helper(num%10);
        String[] Answer=new String[Remaining_Part.length * smallAnswer.length];
        int k=0;
        for(int i=0;i<Remaining_Part.length;i++)
        {
            for(int j=0;j<smallAnswer.length;j++)
            {
                Answer[k]=Remaining_Part[i]+smallAnswer[j];k++;
            }
        }
        return Answer;
    }
    public static String[] Helper(int Index)
    {
        if(Index<=1)
        {
           String[]Null={""};
           return Null;
        }
        else if(Index==2)
        {
            String[]Str={"a","b","c"};
            return Str;
        }
        else if(Index == 3) {
            String[] output = {"d" , "e" , "f"};
            return output;
        }
        else if(Index == 4) {
            String[] output = {"g", "h", "i"};
            return output;
        }
        else if(Index == 5) {
            String[] output = {"j", "k", "l"};
            return output;
        }
        else if(Index== 6) {
            String[] output = {"m", "n" , "o"};
            return output;
        }
        else if(Index== 7) {
            String[] output = {"p", "q", "r", "s"};
            return output;
        }
        else if(Index== 8) {
            String[] output = { "t", "u", "v"};
            return output;
        }
        else {
            String[] output = {"w", "x", "y", "z"};
            return output;
        }
    }
}


