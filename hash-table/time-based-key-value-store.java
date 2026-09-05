class TimeMap {
    HashMap<String,ArrayList<Pair>> map=new HashMap<>();
    public class Pair{
        int timestamp;
        String value;
        public Pair(String value,int timestamp)
        {
            this.value=value;
            this.timestamp=timestamp;
        }
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<Pair>());
        }
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        ArrayList<Pair> list=map.get(key);
        int left=0;
        int right=list.size()-1;
        String answer="";
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(list.get(mid).timestamp <= timestamp)
            {
                left=mid+1;
                answer=list.get(mid).value;
            }
            else{
                right=mid-1;
            }
        }
        return answer;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */