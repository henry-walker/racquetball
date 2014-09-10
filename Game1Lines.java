    public boolean won (int firstScore, int secondScore)
    { return ((firstScore >= 15)
		&& ((! winByTwo)
		    || (firstScore >= secondScore + 2)));
    }
    public int serve (double probWinVolley, int firstScore, int secondScore)
    {   while (Math.random() < probWinVolley)
	    {  firstScore++;
	       if (won (firstScore, secondScore))
		   break;
	    }
	return firstScore;
    }
    public String playUntilWin (double probWinVolley) 
    {	int AScore = 0;
	int BScore = 0;
	while (true)
	    {AScore = serve (probWinVolley, AScore, BScore);
	    if (won (AScore, BScore))
		{  return "A";
		}
	    BScore = serve (1.0 - probWinVolley, BScore, AScore);
	    if (won (BScore, AScore))
		{  return "B";
		}
	} 
    }