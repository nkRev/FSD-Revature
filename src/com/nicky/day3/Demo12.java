package com.nicky.day3;

public class Demo12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        /**append =  add to end
         * output: HelloWorld
         sb.append("World");
         System.out.println(sb);
         **/

        /**insert  = insert to "string" into index
         * output: WorldHello
         sb.insert(0, "World");
         System.out.println(sb);
         **/
        /**replace = replaces "string" into starting index and ending at index
         * output: HWorldlo
         sb.replace(1, 3,"World");
         System.out.println(sb); //prints world in place of e and l characters
         **/

        /**delete = deletes characters based off of start and end index
         * in this case it will print Hlo
         sb.delete(1, 3);
         System.out.println(sb);
         **/
        //reverse = reverses the string; output would be olleH
        sb.reverse();
        System.out.println(sb);
    }
}
