class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        
       
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            /*
            if(map.containsKey(s.charAt(i))){
                
                count=(map.get(s.charAt(i)))+1;
                map.put(s.charAt(i),count);
            }
            */
           
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            


        }
        for(int i=0;i<s.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;

            }
            
                
            int count=map.get(ch)-1;
                if(count==0){
                    map.remove(ch);
                }
                else{
                    map.put(ch,count);
                    }    

        }
        return map.isEmpty();
       

        
    }
}