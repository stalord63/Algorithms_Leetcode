import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isAnagram_242(String s, String t) {
        HashMap<Character,Integer> hash_map= new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
             if(ch != ' ') {
                 if(hash_map.containsKey(ch)){

                    int count=hash_map.get(ch);
                    hash_map.put(ch,count+1);
                    }

                 else

                     hash_map.put(ch,1);


                 }

             }
             System.out.println("HashMap Elements: " + hash_map);

             for (int j=0;j<t.length();j++){
                 Character ch=t.charAt(j);
                 if (hash_map.containsKey(ch)){
                    int count=hash_map.get(ch);
                    hash_map.put(ch,count-1);
                    
                 }
                 else
                 return false;


             }
             
             System.out.println("HashMap Elements: " + hash_map);
             for(int value: hash_map.values()) {
                if (value>=1){
                    return false;
                }
            
            
            }
           return true;   
    }
    
    
        public boolean containsDuplicate_217(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i=0;i<nums.length;i++){
                    if(set.contains(nums[i])){
                        return true;
                    }
                    else
                    set.add(nums[i]);
            }
        return false;
        
        
        }

        
            public int[] getConcatenation_1929(int[] nums) {
                int size=nums.length;
                int new_size=2*size;
                int answer[] = new int[new_size];
                for (int i=0;i<size;i++){
                    System.out.println(nums[i]);
                    answer[i]=nums[i];
                    answer[i+size]=nums[i];
                    
                }
               
            return answer;}
            

            public int[] twoSum_1(int[] nums, int target) {


                int[] answer=new int[2];
                int index=0;
                
                HashMap<Integer,Integer> hash_map=new HashMap<Integer,Integer>();
                for( int x : nums){
                    
                   if( hash_map.containsKey(target-x)){
                        
                        answer[0]=hash_map.get(target-x);
                        answer[1]=index;
                   }
                   else{
                      hash_map.put(x,index);}

                    index++;
                }
                return answer;
            }
            public int lengthOfLastWord_58(String s) {

                int lenghtofword=0;
                       Boolean found=false;
                       for (int i=s.length()-1;i>=0;i--){
                           char ch = s.charAt(i);
                           if (Character.isLetter(ch)){
                               lenghtofword++;
                               found=true;
                           }
                              
                           if (ch==' '&& found==true)  {
       
                               break;}
                           }
                                return lenghtofword;
                       }
            }
        
            

public class leetcode{   
public static void main(String args[]){



Solution obj=new Solution();

String str= "Hello World";
int ans=obj.lengthOfLastWord(str);
System.out.println(ans);


}


}
