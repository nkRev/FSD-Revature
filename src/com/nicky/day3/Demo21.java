package com.nicky.day3;

class UserAlreadyLoggedInException extends Exception{

}

class Authentication{
    private boolean isLoggedIn = false;
    public void login(String email, String password) throws UserAlreadyLoggedInException{
        if(!isLoggedIn){
            if(email.equalsIgnoreCase("admin") && password.equals("123")){
                isLoggedIn = true;
                System.out.println("Login successfully");
            }else{
                System.out.println("Login failed, please try again");
            }
        }else{
            throw new UserAlreadyLoggedInException();
        }
    }
}
public class Demo21 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try{
            auth.login("admin", "123");
        }catch(UserAlreadyLoggedInException e){
            e.printStackTrace();
        }

        try{
            auth.login("admin", "123");
        }catch (UserAlreadyLoggedInException e){
            System.out.println("Hey you already logged in!");
        }
    }
}
