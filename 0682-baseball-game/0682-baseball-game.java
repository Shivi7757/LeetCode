class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        for(String operation : operations){
            switch(operation){
                case "C": score.pop();
                break;
                case "D": score.push(score.peek() * 2);
                break;
                case "+": int sum = score.pop();
                            sum += score.peek();
                            score.push(sum -score.peek());
                            score.push(sum);
                break;
                default: score.push(Integer.parseInt(operation));
                break;
            }
        }
        int sum = 0;
        while(!score.isEmpty()){
            sum += score.pop();
        }
        return sum;
    }
}