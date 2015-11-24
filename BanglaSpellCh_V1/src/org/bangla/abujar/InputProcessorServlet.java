package org.bangla.abujar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * Servlet implementation class InputProcessorServlet
 */
@WebServlet("/InputProcessorServlet")
public class InputProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		String Input = request.getParameter("input");
		System.out.println(Input);
		
		
		
		
		if(Input.equals("অ"))
		{
			System.out.println("অংকন");
			System.out.println("অপমান");
			System.out.println("অমানুষ");
			
		}
		
		
		
		if(Input.equals("আ"))
		{
			System.out.println("আমরা");
			System.out.println("আমর");
			System.out.println("আমার");
			
		}
	char [] token = Input.toCharArray();
	int i;	
	for(i=0;i<=token.length;i++)
	{
		System.out.println(token[i]);
		
	}
		
		
	}

}
