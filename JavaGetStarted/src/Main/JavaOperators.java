//Qinyao Zhang 11.16.19
package Main;

public class JavaOperators {

	/*	Arithmetic Operators
	 	+	Addition	Adds together two values			x + y	
		-	Subtraction	Subtracts one value from another	x - y	
	 	*	Multiplication	Multiplies two values			x * y	
		/	Division	Divides one value from another		x / y	
		%	Modulus	Returns the division remainder			x % y	
		++	Increment	Increases the value of a variable by 1	++x	
		--	Decrement	Decreases the value of a variable by 1	--x
	 */

	/* Opr    Ex     Same as
	 	=	x = 5	x = 5	
		+=	x += 3	x = x + 3	
		-=	x -= 3	x = x - 3	
	 	*=	x *= 3	x = x * 3	
		/=	x /= 3	x = x / 3	
		%=	x %= 3	x = x % 3	
		&=	x &= 3	x = x & 3	
		|=	x |= 3	x = x | 3	
		^=	x ^= 3	x = x ^ 3	
		>>=	x >>= 3	x = x >> 3	
		<<=	x <<= 3	x = x << 3
	 */
	
	
	/*Comparison Operators
	 *  Opr    Name  					Same as
		==	Equal to					x == y	
		!=	Not equal					x != y	
		>	Greater than				x > y	
		<	Less than					x < y	
		>=	Greater than or equal to	x >= y	
		<=	Less than or equal to		x <= y
	 */
	
	/*Logical Operators
	 *  Opr    Name  							Description									EX
		&& 	Logical and		Returns true if both statements are true				x > 5 &&  x < 10	
		|| 	Logical or		Returns true if one of the statements is true			x < 5 || x < 4	
		!	Logical not		Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
	 */
	public static void main(String[] args) {
		
		int x = 5;
	    System.out.println(!(x > 3 && x < 10));
	    System.out.println((x > 3 && x < 10));
	    System.out.println((x < 3 || x < 10));
	}

}
