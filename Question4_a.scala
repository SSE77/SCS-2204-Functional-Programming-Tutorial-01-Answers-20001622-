object payment{
    var workhours_payment=250
    var ot_payment=85 
    var taxpecnt=0.12

    def workpay(work_hours:Int):Int= 
    {
        workhours_payment*work_hours
    } 

    def otpay(ot_hours:Int):Int= 
    {
        ot_payment*ot_hours
    }   
    
    def totalmoney(work_hours:Int,ot_hours:Int):Int=
    {
        workpay(work_hours)+otpay(ot_hours)
    }  

    def tax(work_hours:Int,ot_hours:Int):Double= 
    {   
        var result=(workpay(work_hours)+otpay(ot_hours))
        result*taxpecnt
    }   

    def income(work_hours:Int,ot_hours:Int):Double= 
    {
        totalmoney(work_hours,ot_hours)-tax(work_hours:Int,ot_hours:Int)
    } 

    def main(args: Array[String]):Unit=
    {
        println("The income of the employee:Rs."+income(40,30)+"0") 
        // Then we can change the values and run the code again and again!!!
    }
}