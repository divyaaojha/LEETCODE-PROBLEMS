class Solution {
    public int romanToInt(String s) {
        int number =0;
        int n = s.length();
        char [] c = new char[n];
        c = s.toCharArray();
        for(int i =0; i<n-1; i++){
            if(c[i]== 'I' && c[i+1]=='V' || c[i]== 'I' && c[i+1]=='X' ){
                number -= 1;

            }
           else if(c[i]== 'X' && c[i+1]=='L' || c[i]== 'X' && c[i+1]=='C'){
                number -= 10;

            }
            else if(c[i]== 'C' && c[i+1]=='D' || c[i]== 'C' && c[i+1]=='M'){
                number -= 100;
            }

            else{
                if(c[i] =='I'){
                    number += 1;
                }
                if(c[i] =='V'){
                    number += 5;
                }
                if(c[i] =='X'){
                    number += 10;
                }
                if(c[i] =='L'){
                    number += 50;
                }
                if(c[i] =='C'){
                    number += 100;
                }
                if(c[i] =='D'){
                    number += 500;
                }
                if(c[i] =='M'){
                    number += 1000;
                }

            }


            
        }

         if(c[n-1] =='I'){
                    number += 1;
                }
                if(c[n-1] =='V'){
                    number += 5;
                }
                if(c[n-1] =='X'){
                    number += 10;
                }
                if(c[n-1] =='L'){
                    number += 50;
                }
                if(c[n-1] =='C'){
                    number += 100;
                }
                if(c[n-1] =='D'){
                    number += 500;
                }
                if(c[n-1] =='M'){
                    number += 1000;
                }

        return number;

    }
}