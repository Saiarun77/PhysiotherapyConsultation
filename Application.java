/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Application {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] Patinet_array = new String[10][6];
        
        Scanner s1 = new Scanner(System.in); 
        char CHoice_pepole = 'Y';
        Time_table week = new Time_table();
        int count = 0;
        

        while (CHoice_pepole == 'Y') {
            System.out.println("Welcome to the appointment Syatem:");
            System.out.println("Please Enter the Choice :");
            System.out.println("1. List of treatment and physicians :");
            System.out.println("2. New Appointment Booking / New Consultant Booking");
            System.out.println("3. Cancel / Update a Booking ;");
            System.out.println("4. List all Bookings ");
            System.out.println("5. Booking of a patient");
            
            int c = s1.nextInt();
            switch(c){
                case 1:
                    System.out.println("*****List of Treatment offer by Physician*****");
		    week.displayTimeTable();
		    break;
                    
                case 2:
                    System.out.println("Enter the details :");
                    System.out.println("Patinet Id, Patinet Name, Treatment Name , Physician name , Phone number, Status");
                    
                        for (int a=0; a < 6; a++) {
                             Patinet_array[count][a] = s1.next();
                            }
                            
                     count++;
                     break;
                     
                case 4:
                    System.out.println("Displaying All the patient booking:");
                    
                     System.out.println("Patinet Id             Patinet_name        TreatmentName     Physian  NAme     Phone number    Status");
                    for(int i = 0 ; i < Patinet_array.length ; i++){
                        for(int j = 0 ; j < 6; j++){
                             if(Patinet_array[i][j] == null){
                                 break;
                             }
                             System.out.print(Patinet_array[i][j] + "                   ");
                          }
                            
                              System.out.println();
                             }
                    
                    break;
                   
                case 5:
                    System.out.println("Enter patient id:");
                    String b = s1.next();
                    System.out.println(b);
                     for(int i = 0 ; i < Patinet_array.length ; i++)
                     {
                         
                             String h = Patinet_array[i][0];
                            
                             if(h.equals(b))
                             {
                               
                                 System.out.println("Patinet Id     Patinet_name     TreatmentName  Physian NAme    Phone number  Status");
                                 for(int j = 0 ; j < 6; j++)
                                 
                                 
                                    {
                                        System.out.print(Patinet_array[i][j] + "         ");
                                   
                                    }
                                 
                             }
                           else
                             {
                               System.out.println("Can't find patient");
                             }
                            break;
                    }
                                               System.out.println();
                                               
                       break;
                       
                       
                case 3 :
                     System.out.println("Enter patient id whose Appointment status needs to be changed:");
                     String k = s1.next();
                     System.out.println(k);
                     for(int i = 0 ; i < Patinet_array.length ; i++)
                     {
                         
                             String h = Patinet_array[i][0];
                            
                             if(h.equals(k))
                             {
                               
                                
                                System.out.println("Enter the status : Cancel/Not Cancel");
                                String j = s1.next();
                                Patinet_array[i][5] = j;
                                System.out.println("Updated Sucessfully");
                                 
                                
                                       
                                  
                                    
                                 
                             }
                           else
                             {
                               System.out.println("Can't find patient");
                             }
                            break;
                    }
                                               System.out.println();
                                               
                       break;
                    
               }
                    
                    
            }
            
               
          
            
        }
			
        
        
    }
    

