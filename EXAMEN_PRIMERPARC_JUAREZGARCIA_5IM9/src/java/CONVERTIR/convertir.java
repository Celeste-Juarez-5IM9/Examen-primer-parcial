package CONVERTIR;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   convertir  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   pesos,  resultado;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    pesos   =   Double.parseDouble(req.getParameter("pesos"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    resultado   =   calcularRes(pesos,operacion);

    out.println("<html>");
    out.println("<head><title>Convertidor</title></head>");
    out.println("<body>");
    out.println("<h1><center>La conversión es:</center></h1>");
    out.println("<h2>   <b><center>"+  resultado  +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcularRes(double   pesos, int   operacion)
    {
    double   resultado   =   0;

        switch   (operacion)
        {
        case   1:
            return   pesos/ 20 ;
            
        case   2:
            return   pesos * 20;
  
        }

    return   resultado;
    }
}
 