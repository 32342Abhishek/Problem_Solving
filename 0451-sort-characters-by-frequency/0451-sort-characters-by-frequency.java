class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder("");
       
        while(!map.isEmpty()){
         int f=0;
         char max=0;
         for(char ele:map.keySet()){
            int freq=map.get(ele);
            if(freq>f){
                f=freq;
                max=ele;
            }
         }
         for(int i=0;i<f;i++){
            sb.append(max);
         }
         map.remove(max);
        }
        return sb.toString();
    }
}