
package labexperiment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class currentdateandtimeservlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
	res.setContentType("text/html");
	PrintWriter obj=res.getWriter();
	java.util.Date date = new java.util.Date(); //used java.util.date header file
    obj.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
  obj.close();
	}
}