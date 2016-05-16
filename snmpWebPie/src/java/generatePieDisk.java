
import SNMP.classSNMP;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import utilities.claseDisco;
import utilities.classPieGraph;


public class generatePieDisk extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("image/jpeg");
        OutputStream salida = response.getOutputStream();
        int alto = 500; 
        int ancho = 800; 
        
        //Hacer un método que devuelva un el chart. 
        String disco = request.getParameter("disco");
            if((disco==null)||("".equals(disco))){
                disco = "1"; 
            }
            
            classSNMP objectSNMP= new classSNMP(); 
            claseDisco objectDisk = new claseDisco(""); 
            objectDisk = objectSNMP.consulta("192.168.11.7", disco); 
            
         classPieGraph constructorGrafica = new classPieGraph();    
         JFreeChart chart = constructorGrafica.createChart(constructorGrafica.createDataset(objectDisk)); 
        
        ChartUtilities.writeChartAsJPEG(salida,chart,ancho,alto);
         
                
        salida.close();
        
        }
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
