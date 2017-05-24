public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		if (findKeyword(statement, "no", -1) >= 0)
		{
			response = "Why so negative?";
		}
		
		else if (statement.length() == 0 || statement == " ")
		{
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet.";		
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */
		else if (findKeyword(statement, "robinette", 0) >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
		  response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "i") >= 0)
		{
			//System.out.println("BOI1");
			int psn1 = findKeyword(statement, "i", 0);
			//System.out.println(psn1);
			if (psn1 >= 0 && findKeyword(statement, "you", psn1) >= 0)
			{
				//System.out.println("BOI2");
				response = transformIYouStatement(statement);
			}
		}
		else
		{
		  // Look for a two word (you <something> me)
		  // pattern
		  int psn = findKeyword(statement, "you", 0);

		  if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
		  {
			 response = transformYouMeStatement(statement);
		  }
		  else
		  {
			 response = getRandomResponse();
		  }
		}
		return response;
	}
	
		/**
	* Take a statement with "I want to <something>." and transform it into
	* "What would it mean to <something>?"
	* @param statement the user statement, assumed to contain "I want to"
	* @return the transformed statement
	*/
	private String transformIWantToStatement(String statement)
	{
	  /**
	   * trim the statement
	   * variable lastChar = last character in statement
	   * if lastChar is a period...
	   *        remove the last character from statement
	   */
		String lastChar = statement.substring(statement.length()-1);
		//System.out.println("Last: \"" + lastChar + "\"");
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
			//System.out.println("Statement: " + statement);
		}
	   /* Set new int psn to the result from...
	   *        findKeyword() method @param statement, goal is "I want to "
	   * Set new String restOfStatement to the rest of statement after the
	   * "I want to ".
	   */
	   
		int psn = findKeyword(statement, "i want to");
		String restOfStatement = statement.substring(psn + 9);
		return "What would it mean to" + restOfStatement + "?";
	   /* return "What would it mean to" + restOfStatement; **/
	   
	}

	 /**
	* Take a statement with "you <something> me" and transform it into
	* "What makes you think that I <something> you?"
	* @param statement the user statement, assumed to contain "you" followed by "me"
	* @return the transformed statement
	*/
	private String transformYouMeStatement(String statement)
	{
	  /**
	   * trim the statement
	   * Set new String lastChar to the last character in statement
	   * if lastChar is a period...
	   *        remove the period
	   */
	    String lastChar = statement.substring(statement.length()-1);
		if(lastChar == ".")
		{
			statement = statement.substring(0, statement.length()-1);
		}
	   /* Set new int psnOfYou to the result of findKeyword
	   *        @param statement and "you"
	   * Set new int psnOfMe to the result of findKeyword
	   *      @param statement, "me", and psnOfYou + 3
	   * Set new String restOfStatement to the rest of statement after "You" + 3,
	   * and before "me".
	   *
	   * return "What makes you think that I " + restOfStatement + "you?"
	   * */
	   
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	{
	  /**
	   * trim the statement
	   * Set new String lastChar to the last character in statement
	   * if lastChar is a period...
	   *        remove the period
	   */
	    String lastChar = statement.substring(statement.length()-1);
		if(lastChar == ".")
		{
			statement = statement.substring(0, statement.length()-1);
		}
	   /* Set new int psnOfYou to the result of findKeyword
	   *        @param statement and "you"
	   * Set new int psnOfMe to the result of findKeyword
	   *      @param statement, "me", and psnOfYou + 3
	   * Set new String restOfStatement to the rest of statement after "You" + 3,
	   * and before "me".
	   *
	   * return "What makes you think that I " + restOfStatement + "you?"
	   * */
	   
		int psnOfI = findKeyword(statement, "i");
		//System.out.println(psnOfI);
		int psnOfU = findKeyword(statement, "you", psnOfI + 1);
		//System.out.println(psnOfU);
		String restOfStatement = statement.substring(psnOfI + 1, psnOfU);
		return "Why do you" + restOfStatement + "me?";
	}

	/** Ex_02: The findKeyword() Method...
	
	New String variable phrase = a more searchable version of statement.
		 	-Use a combination of trim() and toLowerCase() modify statement.

		   New int variable psn = the location of goal in phrase after
		   startPos

			-->Refinement: Make sure we find goal by itself, and not part
			of another word ("no" vs no in "know"). if you find an occurrence
			of goal, make sure before and after aren't letters.
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		String before = " ";
		String after = " ";
		int psn = phrase.indexOf(goal, startPos);
		//System.out.println("ran findKeyword. statement is " + statement + ", goal is " + goal + ", and startPos is " + startPos);
		
		while(psn >= 0)
		{
			before = " ";
			after = " ";
			//System.out.println("psn >= 0");
			if(psn > 0)			
			{
				before = phrase.substring(psn - 1, psn);
				//System.out.println("Making a \"before\" String");
				//System.out.println("before is " + before + ".");
			}
			if(goal.length() + psn < phrase.length())
			{
				//System.out.println("Making an \"after\" String");
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
				//System.out.println("after is " + after + ".");
			}
			//System.out.println("Before compared to A is " + before.compareTo("a") + "and \nBefore compared to Z is " + before.compareTo("z") + "and \nAfter compared to A is " + (after.compareTo("a")) + "and \nAfter compared to Z is " + after.compareTo("z"));
			if((before.compareTo("a") < 0 || before.compareTo("z") > 0 )&& 
				(after.compareTo("a") < 0 || after.compareTo("z") > 0))
			{
				//System.out.println("the goal word does not have any letters next to it");
				return psn;
			}
			psn = phrase.indexOf(goal, psn+1);
		}
		return -1;
		/* 
			As long as psn >= 0...
				Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

				//====>code here

				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

				//=====> code here

				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn

				Otherwise, search for goal in phrase from psn + 1 forward */
	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String phrase, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(phrase, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		// if (whichResponse == 0)
			// response = "Interesting, tell me more.";
		// else if (whichResponse == 1)
			// response = "Hmmm.";
		// else if (whichResponse == 2)
			// response = "Do you really think so?";
		// else if (whichResponse == 3)
			// response = "You don't say.";
		
		response = "YOU HAVE FAILED";

		return response;
	}
}
