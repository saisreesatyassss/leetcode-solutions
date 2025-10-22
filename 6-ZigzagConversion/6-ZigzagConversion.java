// Last updated: 10/22/2025, 1:10:35 PM
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        ArrayList<StringBuilder> arr=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            arr.add(new StringBuilder());
        }

        int currrows=0;
        int direction=1;
        for(int i=0;i<s.length();i++){
            arr.get(currrows).append(s.charAt(i));
            if(currrows==0){
                direction=1;
            }else if(currrows==numRows - 1){
                direction=-1;
            }
            if(direction==1){
                currrows++;
            }else{
                currrows--;
            }
        }

        StringBuilder res=new StringBuilder();
        for(StringBuilder ar:arr){
            res.append(ar);
        }

        return res.toString();
    }
}