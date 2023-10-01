/*
Test cases - `1234567890
              asdfghjkl
              Qwertyuiop
                        12345678lkjhgvfQWERTVBNsdfghj,./[];'
              zxcvb    ]'/[;.,     12345678
 */

public class wordcorrection {
    
   
    public static void main(String[] args){
    
        String s="zxcvb    ]'/[;.,     12345678";
        System.out.println("Before:   "+s);
        correction(s);
    }

    public static void correction(String a){


        char[] s=a.toCharArray();


        // Making all character into lower case
        for(int i =0;i<s.length;i++){
            if(s[i]>=65 && s[i]<=90){
                s[i]=(char)(s[i]+32);
            }
        }


        int h=0;


        if(s[0]>=97 && s[0]<=122 )
        {
            s[0]=(char)(s[0]-32);
        }

        for(int i =0;i<s.length;i++){

            if(h==0 && s[i]>=97 && s[i]<=122  && !(i>0)){
                s[i]=(char)(s[i]-32);
                h=1;
            }
            else if(s[i]==' '){
                h=0;
            }

        }


        /*
        IF !i>0
        */



        //printing the array elements one by one
        System.out.print("After:    ");
        for(int i=0;i<s.length;i++){

            System.out.print(s[i]);


        }





    }
}



// I loVe InDIA
// I Love India
