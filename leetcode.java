import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isAnagram(String s, String t) {
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
    
    
        public boolean containsDuplicate(int[] nums) {
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

        
            public int[] getConcatenation(int[] nums) {
                int size=nums.length;
                int new_size=2*size;
                int answer[] = new int[new_size];
                for (int i=0;i<size;i++){
                    System.out.println(nums[i]);
                    answer[i]=nums[i];
                    answer[i+size]=nums[i];
                    
                }
               
            return answer;}
            
           
        
            }

public class leetcode{   
public static void main(String args[]){

//Driver Code


}


}
