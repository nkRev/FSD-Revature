package com.nicky.day3;

public class Demo30 {
    /**
     * try catches can be used in different combinations
     * here are some examples
     */
    public static void main(String[] args) {
        //1st normal try catch
        try{
            //code
        }catch(Exception e){
            //catch block
        }
        //2nd try with multiple catch
        try{
            //try block
        }catch (NullPointerException e){ //specific Exceptions first
            //catch block
        }catch (Exception e){ // more broader Exceptions towards the end
            //2nd catch block
        }finally{
            //finally block
        }
        //3rd nested try catch
        try{
            //can nest try along with normal try block
            try{
                //try block
            }catch(Exception e){
                //catch block
            }
        }catch(Exception e){
            //catch block
        }

        //4th try finally
        try{
            //try block
        }finally {
            //finally block
        }
    }
}
