/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.util.Scanner;
        
public class EQLevel2 {
    
    public void LevelDos() {    
    Scanner keyboard = new Scanner(System.in);
		
		
                System.out.println("The Emotional Intelligence Game");
                System.out.println("Level 2");
                System.out.println("Let's get started!");
                System.out.println();
                System.out.println( "During a team meeting, Misty from Team Valor is facilitating." );
                System.out.println("You have a comment regarding the agenda while Misty is doing an introduction.");
                
                int nextChoice = 1;
		String choice = "";
		while ( nextChoice != 0 )
		{
			if ( nextChoice == 1 )
			{
				
                                System.out.println("Do you wait until the agenda is being drawn?");
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
				System.out.println( "Misty asks you to wait" );
                                System.out.println("Do you \"ask\" again or \"wait\"");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("ask") )
					nextChoice = 6;
                                else if (choice.equals("wait"))
                                    nextChoice = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextChoice == 3 )
			{
				System.out.println( "The agenda is now being drawn up." );
				System.out.println( "Do you \"ask\" again or has your item been \"added\" to the agenda?" );
				
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("ask") )
					nextChoice = 1;
				else if ( choice.equals("added") )
					nextChoice = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if (nextChoice ==4)
                        {
                            System.out.println("Misty has added your item to the agenda. ");
                            System.out.println( "Do you \"restate\" your agenda item or \"wait\"?" );
                            
                            
                            choice= keyboard.nextLine();
                            System.out.println("> ");
                            if (choice.equals("restate"))
                                nextChoice=6;
                            else if (choice.equals("wait"))
                                nextChoice=7;
                            else
					System.out.println( choice + " wasn't one of the options. Try again." );
                            
                        }
                        if ( nextChoice == 5 )
			{
				System.out.println( "You begin to restate your agenda item by talking over Misty. " );
				System.out.println( "Misty continues talking, do you \"wait\" for her to finish or \"continue\" talking? ");
				
				choice= keyboard.nextLine();
                            System.out.println("> ");
                            if (choice.equals("wait"))
                                nextChoice=7;
                            else if (choice.equals("continue"))
                                nextChoice=11;
                            else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextChoice == 6 )
			{
				System.out.println( "Misty asks you to wait until she finishes her sentence." );
				System.out.println( "Do you \"wait\" for her to finish or \"continue\" talking?  " );
				
                            choice= keyboard.nextLine();
                            System.out.println("> ");
                            if (choice.equals("wait"))
                                nextChoice=7;
                            else if (choice.equals("continue"))
                                nextChoice=8;
                            else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextChoice == 7 )
			{
				System.out.println( "While you wait Misty answers your comments regarding the agenda. " );
				System.out.println( "Do you \"restate\" what she said for confirmation or \"drop\" it?  " );
				
				choice= keyboard.nextLine();
                                System.out.println("> ");
                                if (choice.equals("restate"))
                                    nextChoice=9;
                                else if (choice.equals("drop"))
                                    nextChoice=11;
                                else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        
			if ( nextChoice == 8 )
			{
				System.out.println( "The meeting comes to a stop as Misty tell you to stop interrupting her. " );
				System.out.println( "Do you \"wait\" for her to finish or \"continue\" talking?  " );
				
				choice= keyboard.nextLine();
                                System.out.println("> ");
                                if (choice.equals("wait"))
                                    nextChoice=9;
                                else if (choice.equals("continue"))
                                    nextChoice=10;
                                else
                                    System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        
                        
                        if (nextChoice ==9)
                        {
                            System.out.println("The boardroom begins to lose focus and phones begin to come out.");
                            System.out.println("Misty looks frustrated.");
                            System.out.println( "Do you \"add\" your item again or has the agenda item been \"added\"" );
                            
                            choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("add") )
					nextChoice = 10;
				else if ( choice.equals("added") )
					nextChoice = 11;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
                        }
			if (nextChoice ==10)
                        {
                            System.out.println("You have not demonstrated a level of social-awareness, try again");
                            System.out.println();
                            nextChoice=0;
                            
                            GrumpyCatMeme  GrumpyCatMemeObject = new GrumpyCatMeme ();
                            GrumpyCatMemeObject.GrumpyCatMemeGUI(); 
                        }
                         if ( nextChoice == 11 )
			{
				System.out.println( "The meeting has come to an end and everyone leaves." );
                                System.out.println( "Do you think that went well?\"yes\" or \"no\"");
				System.out.println();
                                choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("yes") )
					nextChoice = 12;
				else if ( choice.equals("No") )
					nextChoice = 10;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );

                             }
                         if (nextChoice== 12)
                         {
                             System.out.println();
                             System.out.println("Ash and several others thank you for trying to handle the situation");
                             System.out.println("Brock does not talk to you for the rest of the week ");
                             System.out.println();
                             
                             WoodyBuzzMeme  WoodyBuzzMemeObject = new WoodyBuzzMeme ();
                             WoodyBuzzMemeObject.WoodyBuzzMemeGUI(); 

                             //enter level 3
                             EQLevel3 EQLevel3Object = new EQLevel3();
                             EQLevel3Object.LevelTres();
                         }

		
	}
}
}

