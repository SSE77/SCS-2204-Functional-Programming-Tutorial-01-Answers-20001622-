object profitcount{
    var performancecost=500
    var attendeescost=3
    def attendees(ticketprice:Int):Int=
    { 
        120+(15-ticketprice)/5*20
    } 

    def income(ticketprice:Int):Int=
    {
        attendees(ticketprice:Int)*ticketprice
    }  

    def totalcost(ticketprice:Int):Int=
    {
        500+3*attendees(ticketprice:Int)
    }   

    def profit(ticketprice:Int):Int=
    {
        income(ticketprice:Int)-totalcost(ticketprice:Int)
    }  

    def main(args: Array[String]):Unit =
    {
        println("Ticket price=Rs.5/=, then profit:Rs."+profit(5)+"/=") 
        println("Ticket price=Rs.10/=, then profit:Rs."+profit(10)+"/=") 
        println("Ticket price=Rs.15/=, then profit:Rs."+profit(15)+"/=") 
        println("Ticket price=Rs.20/=, then profit:Rs."+profit(20)+"/=") 
        println("Ticket price=Rs.25/=, then profit:Rs."+profit(25)+"/=") 
        println("Ticket price=Rs.30/=, then profit:Rs."+profit(30)+"/=") 
        println("Ticket price=Rs.35/=, then profit:Rs."+profit(35)+"/=") 
        println("Ticket price=Rs.40/=, then profit:Rs."+profit(40)+"/=")  
        println("Ticket price=Rs.45/=, then profit:Rs."+profit(25)+"/=") 
        println("Ticket price=Rs.50/=, then profit:Rs."+profit(30)+"/=")
        // So, we can fin what is the best ticket price!!!
    }
}   