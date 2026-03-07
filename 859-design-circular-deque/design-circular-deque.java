class MyCircularDeque {
    int[] queue;
    int fr;
    int rr;
    int n;
    int cap;
    public MyCircularDeque(int k) {
      queue=new int[k]; 
      cap=k;
      fr=0;
      rr=-1;
      n=0; 
    }
    
    public boolean insertFront(int value) {
        if(n==cap){
            return false;
        }
        if(n==0){
            rr=fr=0;
        }
        else{
        fr=(fr-1+cap)%cap;
        }
        queue[fr]=value;
        n++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(n==cap){
          return false;
        }
        if(n==0){
            rr=fr=0;
        }
        else{
         rr=(rr+1)%cap;
        }
        queue[rr]=value;
        n++;
        return true;

    }

    public boolean deleteFront() {
        if(n==0){
            return false;
        }
        fr=(fr+1)%cap;
        n--;
        return true;   
    }
    public boolean deleteLast() {
        if(n==0){
            return false;
        }
        
        rr=(rr-1+cap)%cap;
        n--;
        return true;
    }
    
    public int getFront() {
        if(n==0){
            return -1;
        }
        return queue[fr];
    }
    
    public int getRear() {
        if(n==0){
            return -1;
        }
        return queue[rr];
    }
    
    public boolean isEmpty() {
       return n==0; 
    }
    
    public boolean isFull() {
        return n==cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */