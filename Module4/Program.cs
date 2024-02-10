// Intro
Console.WriteLine("ROCK PAPER SCISSORS\n");

// datareader to get user input
Console.WriteLine("Input One of the following:\n \nrock\npaper\nscissors\n");
Console.WriteLine("Choice: ");
string UserInput = Console.ReadLine();

// Game's random choice against user
string[] choices = { "rock", "paper", "scissors" };
Random random = new Random();
int Index = random.Next(0, choices.Length);
string randomChoice = choices[Index];
Console.WriteLine("Random Choice: " + randomChoice);

// Conditionals
if ((UserInput == "rock" && randomChoice == "scissors") || 
    (UserInput == "paper" && randomChoice == "rock") || 
    (UserInput == "scissors" && randomChoice == "paper"))
    {
    Console.WriteLine("User wins!");
    }
else if ((randomChoice == "rock" && UserInput == "scissors") || 
    (randomChoice == "paper" && UserInput == "rock") || 
    (randomChoice == "scissors" && UserInput == "paper"))
    {
    Console.WriteLine("Game wins!");
    }
    else
    {
    Console.WriteLine("It's a tie!");
    }
