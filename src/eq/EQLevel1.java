/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.util.Scanner;

public class EQLevel1 {
    
    public void  LevelUno() {
    Scanner keyboard = new Scanner(System.in);
		
     System.out.println("The Emotional Intelligence Game");
     System.out.println("So you've heard of IQ but what do you know about EQ?");
     System.out.println("EQ is emotional intelligence; its the skill of reading others emotions and reacting accordingly.");
     System.out.println("Let's get started testing our own EQ!");
     System.out.println();
     System.out.println( "In a classroom the instructor is leading the class through exercises." );           
		
                
                
                int nextChoice = 1;
		String choice = "";
		while ( nextChoice != 0 )
		{
			if ( nextChoice == 1 )
			{
				
                                System.out.println("You have a question, do you raise your hand?");
                                System.out.println("\"ask\" or \"wait\"");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("ask") )
					nextChoice = 2;
				else if ( choice.equals("wait") )
					nextChoice = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextChoice == 2 )
			{
				System.out.println( "The instructor asks you to wait" );
                                System.out.println("Do you \"ask\" again or \"wait\"");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("ask") )
					nextChoice = 5;
                                else if (choice.equals("wait"))
                                    nextChoice = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextChoice == 3 )
			{
				System.out.println( "Q&A Period has now started" );
				System.out.println( "Do you \"ask\" again or has your question been \"answered\"" );
				
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("ask") )
					nextChoice = 1;
				else if ( choice.equals("answered") )
					nextChoice = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextChoice == 4 )
			{
				System.out.println( "The classroom has gotten through their Java exercise with little interruption. " );
				System.out.println( "The teacher thanks you for your patience." );
				
				System.out.println();
				System.out.println( "Congratulations! You successfully waited and have demonstrated self-awareness, the first level of EQ." );
				nextChoice = 0;
                                //to proceed to next level
                              EQLevel2 EQLevel2Object = new EQLevel2();
                              EQLevel2Object.LevelDos();
			}
                        if (nextChoice ==5)
                        {
                            System.out.println("The classroom starts to get loud.");
                            System.out.println("The teacher looks flustered.");
                            System.out.println( "Do you \"ask\" again or has your question been \"answered\"" );
                            
                            choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("ask") )
					nextChoice = 6;
				else if ( choice.equals("answered") )
					nextChoice = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
                        }
			if (nextChoice ==6)
                        {
                            System.out.println("You have not demonstrated a level of self-awareness, try again");
                            System.out.println();
                            nextChoice=0;
                            
                            HanginThereCat HanginThereCatObject = new HanginThereCat();
                            HanginThereCatObject.HanginThereCatGUI(); 
                            
                        }
		}

		
	}
}

	

