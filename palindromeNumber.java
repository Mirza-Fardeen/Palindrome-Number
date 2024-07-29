class Solution {
    public boolean isPalindrome(int x) {
      // convert the number to string first
        String s = String.valueOf(x);


      // check if the length of string is just one 
      // since all ones number are palindrom , we will return true

           if(s.length()==1){
               return true;
           }
             // we will divide the string in equal halves
           else{
             // the first half will be from index 0 to half the length of string
               String half = s.substring(0, s.length()/2);


             // the second half will be from index second half of the string till the end
               String lastHalf = s.substring(s.length()/2 , s.length());


             // to avoid go out of bounds we will check if the last half is greater than first half
               if(lastHalf.length()>half.length()){
                   lastHalf = lastHalf.substring(1,lastHalf.length());
               }
               String newLastHalf= "";


             // we will only traverse the last half of the string to match with the first half
               for(int i = lastHalf.length() ; i> 0 ; i-- ){
                   newLastHalf = newLastHalf + lastHalf.charAt(i-1);
               }



            // we check if the first half is equal to last half and return if its true
               if(half.equals(newLastHalf)){
                   System.out.println(half + "  newlasthalf "+ newLastHalf);
                   return true;
               }
               return false;

           }
      
    }
}
