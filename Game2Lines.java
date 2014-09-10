public String playUntilWin (double probWinVolley) 
{int serverScore = 0;
int receiverScore = 0;
int tempScore;
String server = "A";
String receiver = "B";
String temp;
while (true)
{if (Math.random() < probWinVolley)
{  serverScore++;
if ((serverScore >= 15)
&& ((! winByTwo)
|| serverScore >= receiverScore + 2))
{ return server;
}
}
else
{tempScore = serverScore;
serverScore = receiverScore;
receiverScore = tempScore;
temp = server;
server = receiver;
receiver = temp;
probWinVolley = 1.0 - probWinVolley;
}
} 
}
