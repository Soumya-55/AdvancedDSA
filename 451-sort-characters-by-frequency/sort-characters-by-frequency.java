class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       StringBuilder string=new StringBuilder();
       for(int i=0;i<s.length();i++){
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

       } 
       PriorityQueue<Character> queue=new PriorityQueue<>((a,b) ->map.get(b)-map.get(a));
       queue.addAll(map.keySet());
       while(!queue.isEmpty() ){
        char ch=queue.poll();
        int freq=map.get(ch);
        for(int i=0;i<freq;i++){
            string.append(ch);
        }

       }
       return string.toString();

    }
}