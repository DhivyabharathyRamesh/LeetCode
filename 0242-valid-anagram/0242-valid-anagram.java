class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        
       
        
        for(int i=0;i<s.length();i++){
            int count=1;
            if(map.containsKey(s.charAt(i))){
                
                count=(map.get(s.charAt(i)))+1;
                map.put(s.charAt(i),count);
            }

            map.put(s.charAt(i),count);

        }
        for(int i=0;i<s.length();i++){
            if((map.containsKey(t.charAt(i)))==false){
                return false;

            }
            if(map.containsKey(t.charAt(i))){
                char ch=t.charAt(i);
                int count=map.get(ch)-1;
                if(count==0){
                    map.remove(t.charAt(i));
                }
                else{
                    map.put(ch,count);
                    }
                
                
            }
            
            
            

        }
        return map.isEmpty();
       

        
    }
}