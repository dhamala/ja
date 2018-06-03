import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ITServlet
 */
@WebServlet("/ITServlet")
public class ITServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ITServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		double salary = Double.parseDouble(request.getParameter("salary"));
		double deduction = Double.parseDouble(request.getParameter("deduction"));
		double incomeTax = (salary*20/100);
		incomeTax = incomeTax - (incomeTax*deduction/100);
		response.getWriter().append("Name: "+name).append("\nGender: "+gender).append("\nSalary: "+salary).append("\nDeduction: "+deduction).append("\nIncomeTax: "+incomeTax);
		PrintWriter w1 = new PrintWriter("1.txt");
		w1.println("Name: "+name);
		w1.println("Gender: "+gender);
		w1.println("Salary: "+salary);
		w1.println("Deduction: "+deduction);
		w1.println("IncomeTax: "+incomeTax);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
