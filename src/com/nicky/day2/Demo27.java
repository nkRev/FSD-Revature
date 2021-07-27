package com.nicky.day2;
interface DB{ //interface to connect to multiple databases
    void connection();//makes connection to database
    interface MYSQL{
        //interface for MYSQL Database
    }
    interface MongoDB{
        //interface for MongoDB
    }
}
class MyApp implements DB.MongoDB{
    //implement interface for MongoDB and make the connection to it
}
public class Demo27 {
    public static void main(String[] args) {

    }
}
