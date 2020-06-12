/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author NEERAJ
 */
interface operation{
    abstract void Add();
    abstract void Sub();
    abstract void Mul();
    abstract void Div();
    abstract void Mod();
}

class Action implements operation{
    // class variable
    double Addition;
    double Substraction;
    double Multiplecation;
    double Division;
    double Modular;
    private double a;
    private double b;
    public Action()  //constructor
    {
        this.Addition=0;
        this.Substraction=0;
        this.Multiplecation=0;
        this.Division=0;
        this.Modular=0;
        
    }
    
    public void setFirstValue(double x)
    {
        this.a=x;
        
    }
    public void setSecondValue(double y)
    {
        this.b=y;
        
    }
    public double getFirstValue()
    {
        return a;       
    }
    public double getSecondValue()
    {
        return b;       
    }

    @Override
    public void Add() {
        Addition=a+b;
        System.out.println("Addition of "+a +"+"+ b+" = "+Addition);
    }

    @Override
    public void Sub() {
        Substraction=a-b;
        System.out.println("Substraction of "+a +"-"+ b+" = "+Substraction);
    }

    @Override
    public void Mul() {
        Multiplecation=a*b;
        System.out.println("Multiplication of "+a +"*"+ b+" = "+Multiplecation);
    }

    @Override
    public void Div() {
        Division=a%b;
        System.out.println("Division of "+a +"/"+ b+" = "+Division);
    }

    @Override
    public void Mod() {
        Modular=a%b;
        System.out.println("Modular of "+a +"%"+ b+" = "+Modular);
    }
    
    
}
public class Calculator {

   
    public static void main(String[] args) {
        Action a=new Action();
        System.out.println("Welcome to Calculator...");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        String firstNum=sc.nextLine();
        System.out.println("Enter Second Number : ");
        String SecNum=sc.nextLine();
        double firstNum2=Double.parseDouble(firstNum);
        double SecNum2=Double.parseDouble(SecNum);
        a.setFirstValue(firstNum2);
        a.setSecondValue(SecNum2);
        
        System.out.println("Choose Operation ...");
        System.out.println("1 [Addition]");
        System.out.println("2 [Substraction]");
        System.out.println("3 [Multiplecation]");
        System.out.println("4 [Division]");
        System.out.println("5 [Modular]");
        
        String choose=sc.nextLine();
       switch(choose)
       {
           case "1":
               a.Add();
               break;
           case "2":
               a.Sub();
               break;
           case "3":
               a.Mul();
               break;
           case "4":
               a.Div();
               break;
           case "5":
               a.Mod();
               break;
               default:
                   System.out.println("Enter Valid Number");
       }
    }
    
}
