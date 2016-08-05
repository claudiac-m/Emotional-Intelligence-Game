/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.util.Scanner;


public class EQLevel3 {
    public void LevelTres(){
        Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";
                
                System.out.println();
                System.out.println("Welcome to EQ Level 3!");
                System.out.println("It's the last stage in Emotional Intelligence so read carefully");
                System.out.println("You are leading a scrum meeting and have asked Ash to break down the tasks on post-its. ");
                System.out.println("Misty has asked to add his items to the board.");
               
                
                
		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println("Ash continues on, do you \"ask\" on Misty's behalf or \"ignore\" it");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("ask") )
					nextroom = 2;
				else if ( choice.equals("ignore") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "Ash continues speaking. Do you \"ask\" him again or do you encourage Misty to \"try\" again?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("ask") )
					nextroom = 4;
				else if ( choice.equals("try") )
					nextroom = 5;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 3 )
			{
				
				System.out.println( "Ash continues to work on the task division, Misty looks away." );
				System.out.println( "How do you want to approach the situation?" );
				System.out.println( "Do you want to take Ash \"aside\" or approach \"Misty\"?" );
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("aside") )
					nextroom = 6;
				else if ( choice.equals("Misty") )
					nextroom = 7;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "Ash says he will give it to her in a moment, the moment passes" );
                                System.out.println( "but he won't let her close enough to add tasks to the SCRUM board" );
				System.out.println( "Do you want to take Ash \"aside\" or help \"Misty\"?" );
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("aside") )
					nextroom = 6;
				else if ( choice.equals("Misty") )
					nextroom = 7;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "Misty tries to add her tasks again, this time Ash takes the pen away from her." );
				System.out.println( "Do you want to take Ash \"aside\" or help \"Misty\"?" );
				choice = keyboard.nextLine();
				if ( choice.equals("aside") )
					nextroom = 6;
				else if ( choice.equals("Misty") )
					nextroom = 7;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}	
                        if ( nextroom == 6 )
			{
				System.out.println( "You take Ash aside outside of the meeting room" );
                                System.out.println( "He doesn't seem receptive to how he made Misty feel" );
                                System.out.println( "Do you try to make Ash \"understand\" or talk to \"Misty\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("understand") )
					nextroom = 8;
				else if ( choice.equals("Misty") )
					nextroom = 7;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 7 )
			{
				System.out.println( "You take Misty aside outside of the meeting room" );
                                System.out.println( "She shares her frustration with you" );
                                System.out.println( "Do you approach \"Ash\" on her behalf or do you encourage her to \"talk\" to Ash herself? " );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("Ash") )
					nextroom = 6;
				else if ( choice.equals("talk") )
					nextroom = 9;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 8 )
			{
				System.out.println( "You take Ash aside outside of the meeting room" );
                                System.out.println( "He doesn't seem to understand " );
                                System.out.println( "You want to speak to Ash. There is a \"corner\" in the meeting space and a doorway to the \"hall\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("corner") )
					nextroom = 10;
				else if ( choice.equals("hall") )
					nextroom = 9;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 9 )
			{
				System.out.println( "Misty talks to Ash in front of the group" );
                                System.out.println( "Ash appears uncomfortable and Misty is getting frustrated. " );
                                System.out.println( "What can you do to release the tension in the room, address it \"publicly\" or \"ignore\" it." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("publicly") )
					nextroom = 10;
				else if ( choice.equals("ignore") )
					nextroom = 11;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 10 )
			{       
                                System.out.println( "In front of the group, you try to regain control and mediate between the two" );
                                System.out.println( "Both Ash and Misty are not looking at you and the tone in the room has changed " );
				System.out.println( "Do you take on task division \"yourself\" or  \"drop\" the issue?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("yourself") )
					nextroom = 11;
				else if ( choice.equals("drop") )
					nextroom = 13;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 11 )
			{       
                                System.out.println( "When you take on task division, you start with Misty's additions" );
                                System.out.println( "The room is tense, how do you address them? " );
				System.out.println( "Do you tell everyone that \"space\" must be made for everyone or do you take  Ash  \"aside\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("space") )
					nextroom = 12;
				else if ( choice.equals("aside") )
					nextroom = 13;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if ( nextroom == 12 )
			{
				System.out.println( "Ash continues to dividing tasks and Misty sits with her arms crossed" );
                                System.out.println( "You are losing control as the facilitator, what is your next step? " );
                                System.out.println( "Do you  \"reassign\" Ash to note taking or do you let the meeting \"continue\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("reassign") )
					nextroom = 13;
				else if ( choice.equals("continue") )
					nextroom = 14;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
                        if (nextroom ==13)
                        {
                                System.out.println( "The room feels less tense and Misty and Ash are talking " );
				System.out.println( "Misty compliments the way you handled the situation afterwards" );
				System.out.println( "You walk out of the meeting having learned how to handle a new situation. " );
				System.out.println();
				System.out.println( "You have shown some understanding of self and relationship management, keep working at EQ." );
				nextroom = 0;
                                
                                FryEQMeme  FryEQMemeObject = new FryEQMeme ();
                                FryEQMemeObject.FryEQMemeGUI(); 
                        }    
                        if (nextroom ==14)
                                System.out.println( "The meeting continues and tension builds" );
				System.out.println( "Misty is not making eye contact and Ash approachs you afterward" );
				System.out.println( "to say he doesn't appreciate your leadership style." );
				System.out.println();
				System.out.println( "You have not yet mastered self and relationship management but keep working at it" );
				nextroom = 0;
                                
                                MatrixEQMeme  MatrixEQMemeObject = new MatrixEQMeme ();
                                MatrixEQMemeObject.MatrixEQMemeGUI(); 
                              
                }

		System.out.println( "\nEQ is a a process of continous improvement, don't stop working at it!" );
	}
        
	
}
   



    
    
    

