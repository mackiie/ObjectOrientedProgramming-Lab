

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		
		int k = 0;
        String[] values = req.getParameterValues("t");
        
        for (int i=0; i<values.length; i++)
        {
        	k+= Integer.parseInt(values[i]);
        }

		
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(k);
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("Organization");
		out.println(str);
		
	}

}
