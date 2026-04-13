/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchatapp1;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class QuickChatApp1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The user is asked to input first name
        System.out.println("Please enter your first name ");
        String firstName = scanner.nextLine();
        
        //The user is asked to input last name
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
                
        //The user is asked to input username
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();

        //The user is asked to input password
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();

        //The user is asked to input cell number
        System.out.print("Please enter cell phone number with +27: ");
        String phoneNumber = scanner.nextLine();

        // A registration object is created to ensure that the details entered are correct
        Registration reg = new Registration(username, password, phoneNumber);
        System.out.println(reg.validateUsername());
        System.out.println(reg.validatePassword());
        System.out.println(reg.validatePhoneNumber());

        // These messages get output if the user entered registration details correctly
        if (reg.validateUsername().equals("Username successfully captured.") &&
            reg.validatePassword().equals("Password successfully captured.") &&
            reg.validatePhoneNumber().equals("Cell phone number successfully added.")) {

            System.out.print("Please enter your username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Please enter your password: ");
            String loginPassword = scanner.nextLine();

            // Login object is created to check the login details and the login status
            Login login = new Login(reg.getUsername(), reg.getPassword());
            System.out.println(login.returnLoginStatus(loginUsername, loginPassword, firstName, lastName));
        } else {
            System.out.println("Registration failed. Please try again.");
        }
    }

    }

