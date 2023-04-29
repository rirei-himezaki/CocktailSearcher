package controller;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CocktailModel;


@WebServlet("/register")
public class CocktailController extends HttpServlet {
	  public void doPost(HttpServletRequest req, HttpServletResponse res)
		      throws IOException, ServletException {
		    // リクエストの文字コード指定
		    req.setCharacterEncoding("utf-8");
		    
	//入力情報の取得
	String[] base = req.getParameterValues("base");
	String[] degree = req.getParameterValues("degree");
	String[] taste = req.getParameterValues("taste");
	String[] glass = req.getParameterValues("glass");
	String[] temperature = req.getParameterValues("temperature");

	//Beanの作成
	CocktailModel cocktailBean = new CocktailModel();
	cocktailBean.setBase(base);
	cocktailBean.setDegree(degree);
	cocktailBean.setTaste(taste);
	cocktailBean.setglass(glass);
	cocktailBean.setTemperature(temperature);
	  
    // Beanをリクエストに格納
    req.setAttribute("cocktailBean", cocktailBean);
    
    // register4.jspへフォワード(画面表示をjspに任せる)
    RequestDispatcher rd = req.getRequestDispatcher("/Introduction.jsp");
    rd.forward(req, res);
	  }
}