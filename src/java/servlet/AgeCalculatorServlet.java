
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SYX
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        
        request.setAttribute("age",age);
        
        if(age==null||age.equals("")){
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
            request.setAttribute("message","You must give your current age");
        
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            
            return;
        }
        
        if(age.equals("")){
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
            request.setAttribute("message","You must enter a number");
        
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);   
            
            return;
        }
        
        if(age > 0){
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
            request.setAttribute("message","Your next birthday will be");
        
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);   
            
            return;
        }        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);       
    }
}
