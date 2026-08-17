class Solution {
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s= s.replace("()","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else{
                break;
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}