object values{
    def main(args: Array[String]): Unit =
    {
        var a=2
        var b=3
        var c=4
        var d=5
        var k=4.3f 
        var g=4.0f// this is from the first question!!!

        //a) println( - -b * a + c *d - -) 
        b=b-1
        println("a)"+(b * a + c *d)) 
        d=d-1

        //b)println(a++)
        println("b)"+(a)) 
        a=a+1

        //c)println (–2 * ( g – k ) +c) 
        println("c)"+(1*(g-k)+c))

        //d)println (c=c++)
        println("d)"+(c)) 
        c=c+1

        //e)println (c=++c*a++)
        c=c+1
        c=((c)*(a)) 
        a=a+1 
        println("e)"+(c))
        
    }
}