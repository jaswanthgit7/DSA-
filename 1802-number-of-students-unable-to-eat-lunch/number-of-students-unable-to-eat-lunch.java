import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();

        for(int s : students){
            queue.add(s);
        }

        int i = 0;
        int rotations = 0;

        while(!queue.isEmpty() && rotations < queue.size()){

            if(queue.peek() == sandwiches[i]){
                queue.remove();
                i++;
                rotations = 0;
            }
            else{
                queue.add(queue.remove());
                rotations++;
            }
        }

        return queue.size();
    }
}