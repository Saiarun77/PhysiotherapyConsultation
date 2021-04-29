/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Time_table {

	public void displayTimeTable() {

		int physicianID[] = { 1, 2, 3, 4, 5, 6 };
		String physicianName[] = { "kim", "linen", "den", "gon", "son", "lip" };
		String physicianAddress[] = { "djncjsd", "next to deck", "Denmark", "lonin", "savepool", "JIO" };
		int physicianPhNumber[] = { 1234775, 43333234, 4443344, 6533676, 8733654, 3453323 };
		String specialized[] = { "Osteopathy", "Rehabilitation", "Paediatrics", "Neurology", "Geriatrics",
				"Neurology" };
		String workDate[] = { "03-05-2021", "04-05-2021", "05-05-2021", "06-05-2021", "07-05-2021", "10-05-2021" };
		String room[] = {"A ward" , "B ward", "C ward" , "gym", "swimming pool", "D ward"};
		
		

		System.out.println("********************************************************************************************************************************************");
		System.out.println(
				"PhysicianID\tPhysicianName\tPhysicianAddress\tPhysicianPhNumber\tSpecialized   \t         Date   \t  Room Available");
		System.out.println("********************************************************************************************************************************************");

		for (int count = 0; count < physicianID.length; count++) {

			System.out.println(physicianID[count] + "        \t" + physicianName[count] + "        \t"
					+ physicianAddress[count] + "        \t" + physicianPhNumber[count] + "           \t"
					+ specialized[count] + "        \t" + workDate[count]+ "        \t" +room[count]);

		}
	}

}
